package com.task.vendingmachine.model;

public enum Beverage {
	COKE(25, "Coke"),
	PEPSI(35, "Pepsi"),
	SODA(45, "Soda");
	
	private int price;
	private String name;
	
	private Beverage(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
}
