package com.task.vendingmachine;

import java.util.List;
import java.util.Scanner;

import com.task.vendingmachine.model.Coin;

public class IOHandler {
	Scanner scanner;
	
	public IOHandler() {
		this.scanner = new Scanner(System.in);
		
	}
	
	
	public int getNumberInputInRange(int low, int high) {
		int inputInt = -1;
		String input;
		while(!(low <= inputInt && inputInt <= high)) {
			input = scanner.nextLine();
			try {
				inputInt = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				print("Enter a number");
			}
		}
		return inputInt;
	}
	
	
	public void print(String message) {
		System.out.println(message);
	}
	
	public void printCoinList(List<Coin> coins) {
		StringBuilder builder = new StringBuilder();
		for (Coin coin : coins) {
			builder.append(coin + ", ");
		}
		print(builder.toString());
	}
}
