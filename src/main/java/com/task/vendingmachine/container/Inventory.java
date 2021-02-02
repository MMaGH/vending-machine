package com.task.vendingmachine.container;

import java.util.List;
import java.util.Map;

import com.task.vendingmachine.model.Beverage;

public class Inventory {
	
	public Map<Beverage, Integer> getConsumption() {
		return null;
	}
	
	public Beverage getBeverage(String name) {
		Beverage beverage = null;
		
		switch (name.toLowerCase()) {
		case "pepsi":
			beverage = Beverage.Pepsi;
			break;
		case "coke":
			beverage = Beverage.Coke;
		case "soda":
			beverage = Beverage.Soda;
		default:
			break;
		}
		
		return beverage;
	}
	
	public boolean buyBeverage(Beverage beverage) {
		return false;
	}
	
	public void resetInventory() {
		
	}
	
}
