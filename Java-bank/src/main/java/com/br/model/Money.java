package com.br.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Getter

public class Money {
			private final List<MoneyAudit> history= new ArrayList<>();

			public Money(final MoneyAudit history) {
				this.history.add(history);
			}
			
			public void addHistory(final MoneyAudit history) {
				this.history.add(history);
			}

			public Collection<Money> getHistory() {
				// TODO Auto-generated method stub
				return null;
			}
			
			
}
