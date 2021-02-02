package com.task.vendingmachine;

import java.util.List;
import java.util.Map;

import com.task.vendingmachine.container.Balance;
import com.task.vendingmachine.container.Inventory;
import com.task.vendingmachine.model.Beverage;
import com.task.vendingmachine.model.Coin;

public class VendingMachine {
	private Balance balance;
	private Inventory inventory;
	
	public VendingMachine() {
		this.balance = new Balance();
		this.inventory = new Inventory();
	}
	
	public VendingMachine(Balance balance, Inventory inventory) {
		this.balance = balance;
		this.inventory = inventory;
	}
	
	
	
	public void addFund(Coin coin) {
		
	}
	
	public void addFund(List<Coin> coins) {
		
	}
	
	public void selectBeverage(String name) {
		
	}
	
	public void confirmPurchase() {
		
	}
	
	public int getBalance() {
		return 0;
	}
	
	public List<Coin> getChange() {
		return null;
	}
	
	public List<Coin> cancelPurchase() {
		return null;
	}
	
	public void reset() {
		
	}
	
	public Map<Beverage, Integer> getConsumption() {
		return null;
	}
	
	public void setBalance(Balance balance) {
		this.balance = balance;
	}
	
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
}