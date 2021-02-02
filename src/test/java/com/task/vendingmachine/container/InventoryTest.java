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
		
		assertEquals(Beverage.COKE, inventory.getBeverage("Coke"));
		assertEquals(Beverage.SODA, inventory.getBeverage("Soda"));
		assertEquals(Beverage.PEPSI, inventory.getBeverage("Pepsi"));
		
	}
	
	
	@Test
	void consumptionIsTracked() {
		Inventory inventory = new Inventory();
		
		inventory.buyBeverage(Beverage.COKE);
		inventory.buyBeverage(Beverage.COKE);
		inventory.buyBeverage(Beverage.PEPSI);
		
		Map<Beverage, Integer> expectedMap = new HashMap<Beverage, Integer>();
		expectedMap.put(Beverage.COKE, 2);
		expectedMap.put(Beverage.PEPSI, 1);
		expectedMap.put(Beverage.SODA, 0);
		
		assertEquals(expectedMap, inventory.getConsumption());
	}
	
	@Test
	void resetInventoryClearsConsumption( ) {
		Inventory inventory = new Inventory();
		
		inventory.buyBeverage(Beverage.COKE);
		inventory.buyBeverage(Beverage.COKE);
		inventory.buyBeverage(Beverage.PEPSI);
		
		Map<Beverage, Integer> expectedMap = new HashMap<Beverage, Integer>();
		
		expectedMap.put(Beverage.COKE, 0);
		expectedMap.put(Beverage.PEPSI, 0);
		expectedMap.put(Beverage.SODA, 0);

		inventory.resetInventory();
		
		assertEquals(expectedMap, inventory.getConsumption());
	}
	
	
}
