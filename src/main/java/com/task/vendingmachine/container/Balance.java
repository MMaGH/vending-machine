package com.task.vendingmachine.container;

import com.task.vendingmachine.model.Coin;
import java.util.*;

public class Balance {
	private int balance;
	

	public void addCoin(Coin coin) {
		this.balance += coin.getValue();
	}
	
	public void addCointList(List<Coin> coinList) {
		for(Coin coin : coinList) {
			this.balance += coin.getValue();
		}
	}
	
	public List<Coin> getChange() {
		List<Coin> change = new ArrayList<>();
		List<Coin> coins = Arrays.asList(Coin.QUARTER, Coin.DIME, Coin.NICKEL, Coin.PENNY);
		for (Coin coin : coins) {
			change.addAll(getCoins(coin));
		}
		return change;
	}
	
	public boolean pay(int amount) {
		boolean success = false;
		this.balance -= amount;
		if (this.balance >= 0 ) {
			success = true;
		} else {
			this.balance += amount;
		}
		return success;
	}
	
	public int getBalance() {
		return this.balance;
	}

	
	private List<Coin> getCoins(Coin coin) {
		List<Coin> coins = new ArrayList<>();
		int amount = this.balance / coin.getValue();
		for (int i = 0; i < amount; i++) {
			this.balance -= coin.getValue();
			coins.add(coin);
		}
		
		return coins;
	}
}
