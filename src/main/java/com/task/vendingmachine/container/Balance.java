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
		return null;
	}
	
	public void pay(int amount) {
		this.balance -= amount;
	}
	
	public int getBalance() {
		return this.balance;
	}
}
