package com.example.model;

public class User {
	
	private Long userId;
	private String name;
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public User(Long userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
