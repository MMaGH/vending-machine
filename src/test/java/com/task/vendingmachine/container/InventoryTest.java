package com.task.vendingmachine.container;

import org.junit.jupiter.api.*;

import com.task.vendingmachine.model.Beverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class InventoryTest {
	
	@Test
	void getBeverageReturnsCorrectBeverage() {
		Inventory inventory = new Inventory();
		
		assertEquals(Beverage.Coke, inventory.getBeverage("Coke"));
		assertEquals(Beverage.Soda, inventory.getBeverage("Soda"));
		assertEquals(Beverage.Pepsi, inventory.getBeverage("Pepsi"));
		
	}
	
	
	@Test
	void consumptionIsTracked() {
		Inventory inventory = new Inventory();
		
		inventory.buyBeverage(Beverage.Coke);
		inventory.buyBeverage(Beverage.Coke);
		inventory.buyBeverage(Beverage.Pepsi);
		
		Map<Beverage, Integer> expectedMap = new HashMap<Beverage, Integer>();
		expectedMap.put(Beverage.Coke, 2);
		expectedMap.put(Beverage.Pepsi, 1);
		
		assertEquals(expectedMap, inventory.getConsumption());
	}
	
	@Test
	void resetInventoryClearsConsumption( ) {
		Inventory inventory = new Inventory();
		
		inventory.buyBeverage(Beverage.Coke);
		inventory.buyBeverage(Beverage.Coke);
		inventory.buyBeverage(Beverage.Pepsi);
		
		Map<Beverage, Integer> expectedMap = new HashMap<Beverage, Integer>();

		inventory.resetInventory();
		
		assertEquals(expectedMap, inventory.getConsumption());
	}
	
	
}
