package com.task.vendingmachine.container;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import com.task.vendingmachine.model.Coin;


public class BalanceTest {
	
	Balance balance = new Balance();
	
	
	@Test
	void addCoinIncreasesBalance() {
		balance.addCoin(Coin.QUARTER);
		assertEquals(25, balance.getBalance());
		
		balance.addCoin(Coin.NICKEL);
		assertEquals(30, balance.getBalance());
		
	}
}
