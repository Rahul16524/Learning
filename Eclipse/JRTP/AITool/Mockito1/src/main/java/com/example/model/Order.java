package com.example.model;

public class Order {
	private Long orderId;
	private Long userId;
	private String product;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public Order(Long orderId, Long userId, String product) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.product = product;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
