package com.br.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@ToString
public abstract class Wallet {

	@Getter
	private final BankingService bankingService;
	
	
	protected final List<Money> moneys;


	public Wallet(final BankingService bankingService) {
		super();
		this.bankingService = bankingService;
		this.moneys=new ArrayList<>();
	}
	
	protected List<Money> generateMoney(final long amount,final String description){
		
	}
	
	public long getFunds() {
		return moneys.size();
	}
	
	
	
}
