package com.br.model;

import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.stream.Stream;

import lombok.Getter;

@Getter
public class InvestmentWallet extends Wallet{

    private final BankingService investment;
    private final AccountWallet account;

    public InvestmentWallet(final BankingService investment, final AccountWallet account, final long amount) {
        super(investment);
        this.investment = investment;
        this.account = account;
        addMoney(account.reduceMoney(amount), getService(), "investimento");
    }

    private BankingService getService() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateAmount(final long percent){
        var amount = getFunds() * percent / 100;
        var history = new MoneyAudit(UUID.randomUUID(), getService(), "rendimentos", OffsetDateTime.now());
        var money = Stream.generate(() -> new Money(history)).limit(amount).toList();
        this.money.addAll(money);
    }

    @Override
    public String toString() {
        return super.toString() + "InvestmentWallet{" +
                "investment=" + investment +
                ", account=" + account +
                '}';
    }
}