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
			beverage = Beverage.PEPSI;
			break;
		case "coke":
			beverage = Beverage.COKE;
			break;
		case "soda":
			beverage = Beverage.SODA;
			break;
		default:
			break;
		}
		
		return beverage;
	}
	
	public boolean buyBeverage(Beverage beverage) {
		boolean success = false;
		int beverageCount = stock.get(beverage);
		if (beverageCount > 0) {
			stock.replace(beverage, beverageCount - 1);
			consumption.replace(beverage, consumption.get(beverage) + 1);
			success = true;
		}
		return success;
	}
	
	public void resetInventory() {
		this.stock = new HashMap<Beverage, Integer>();
		
		stock.put(Beverage.COKE, 100);
		stock.put(Beverage.PEPSI, 100);
		stock.put(Beverage.SODA, 100);
		
		this.consumption = new HashMap<Beverage, Integer>();
		
		consumption.put(Beverage.COKE, 0);
		consumption.put(Beverage.PEPSI, 0);
		consumption.put(Beverage.SODA, 0);
	}


}
