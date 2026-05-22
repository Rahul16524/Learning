package com.example.model;

public class Transaction {
	
	private String customerId;
	private String type;
	private double amount;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Transaction(String customerId, String type, double amount) {
		super();
		this.customerId = customerId;
		this.type = type;
		this.amount = amount;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
