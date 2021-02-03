package com.task.vendingmachine;

import java.util.Scanner;

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
	
}
