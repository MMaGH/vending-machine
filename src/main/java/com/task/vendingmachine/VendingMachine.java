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
	
	private Beverage beverage;
	
	public VendingMachine() {
		this.balance = new Balance();
		this.inventory = new Inventory();
	}
	
	public VendingMachine(Balance balance, Inventory inventory) {
		this.balance = balance;
		this.inventory = inventory;
	}
	
	
	
	public void addFund(Coin coin) {
		balance.addCoin(coin);
	}
	
	public void addFund(List<Coin> coins) {
		balance.addCointList(coins);
	}
	
	public void selectBeverage(String name) {
		this.beverage = inventory.getBeverage(name);
	}
	
	public boolean confirmPurchase() {
		boolean success = balance.pay(beverage.getPrice());
		if (success) {
			inventory.buyBeverage(beverage);
			beverage = null;
		}
		return success;
	}
	
	public int getBalance() {
		return balance.getBalance();
	}
	
	public List<Coin> getChange() {
		return balance.getChange();
	}
	
	public List<Coin> cancelPurchase() {
		this.beverage = null;
		return balance.getChange();
	}
	
	public void reset() {
		inventory.resetInventory();
		balance.reset();
	}
	
	public Map<Beverage, Integer> getConsumption() {
		return inventory.getConsumption();
	}
	
	public void setBalance(Balance balance) {
		this.balance = balance;
	}
	
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
}