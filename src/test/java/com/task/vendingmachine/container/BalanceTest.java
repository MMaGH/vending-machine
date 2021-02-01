package com.task.vendingmachine.container;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import com.task.vendingmachine.model.Coin;


public class BalanceTest {
	
	
	@Test
	void addCoinIncreasesBalance() {
		Balance balance = new Balance();
		balance.addCoin(Coin.QUARTER);
		assertEquals(25, balance.getBalance());
		
		balance.addCoin(Coin.NICKEL);
		assertEquals(30, balance.getBalance());
	}
	
	@Test
	void payDecresesBalance() {
		Balance balance = new Balance();
		balance.addCoin(Coin.QUARTER);
		balance.addCoin(Coin.QUARTER);
		
		balance.pay(45);
		
		assertEquals(5, balance.getBalance());
	}
	
	@Test
	void getChangeReturnsRemainderChange() {
		Balance balance = new Balance();
		
		balance.addCoin(Coin.QUARTER);
		balance.addCoin(Coin.QUARTER);
		balance.addCoin(Coin.NICKEL);
		
		balance.pay(35);
		
		List<Coin> expectedCoins = Arrays.asList(Coin.NICKEL, Coin.NICKEL);
		
		assertEquals(expectedCoins, balance.getChange());
	}
	
}
