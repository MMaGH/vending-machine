package com.task.vendingmachine.container;

import com.task.vendingmachine.model.Coin;
import java.util.*;

public class Balance {
	private List<Coin> coins = new ArrayList<>();
	private int value;
	

	public void addCoin(Coin coin) {
		this.coins.add(coin);
	}
	
	public void addCointList(List<Coin> coinList) {
		this.coins.addAll(coinList);
	}
	
	public List<Coin> getChange() {
		return null;
	}
	
	public void pay(int amount) {
		
	}
}
