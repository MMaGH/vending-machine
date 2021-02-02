package com.task.vendingmachine.container;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.task.vendingmachine.model.Beverage;

public class Inventory {
	private Map<Beverage, Integer> stock;
	private Map<Beverage, Integer> consumption;
	
	public Inventory() {
		resetInventory();
	}
	
	
	public Map<Beverage, Integer> getConsumption() {
		return consumption;
	}
	
	public Beverage getBeverage(String name) {
		Beverage beverage = null;
		
		switch (name.toLowerCase()) {
		case "pepsi":
			beverage = Beverage.Pepsi;
			break;
		case "coke":
			beverage = Beverage.Coke;
			break;
		case "soda":
			beverage = Beverage.Soda;
			break;
		default:
			break;
		}
		
		return beverage;
	}
	
	public boolean buyBeverage(Beverage beverage) {
		
		return false;
	}
	
	public void resetInventory() {
		this.stock = new HashMap<Beverage, Integer>();
		
		stock.put(Beverage.Coke, 100);
		stock.put(Beverage.Pepsi, 100);
		stock.put(Beverage.Soda, 100);
		
		this.consumption = new HashMap<Beverage, Integer>();
	}
	
}
