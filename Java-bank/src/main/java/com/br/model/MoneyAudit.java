package com.br.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public record MoneyAudit(
	UUID transactionId,
	BankingService targetService,
	String description,
	OffsetDateTime createdAt)
{

}
