package com.task.vendingmachine.model;

public enum Beverage {
	Coke(25),
	Pepsi(35),
	Soda(45);
	
	private int price;
	
	private Beverage(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
}
