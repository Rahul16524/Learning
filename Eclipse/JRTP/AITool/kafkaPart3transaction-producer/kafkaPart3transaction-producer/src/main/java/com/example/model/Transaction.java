package com.example.model;

public class Transaction {

	private String customerId;
	private String type;
	private Double amount;
	
	public Transaction() {
		
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Transaction(String customerId, String type, Double amount) {
		super();
		this.customerId = customerId;
		this.type = type;
		this.amount = amount;
	}
	
	
}
