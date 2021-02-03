package com.task.vendingmachine;

import java.util.Scanner;

public class IOHandler {
	Scanner scanner;
	
	public IOHandler() {
		this.scanner = new Scanner(System.in);
		
	}
	
	
	public int getNumberInput() {
		return 0;
	}
	
	
	public void print(String message) {
		System.out.println(message);
	}
	
}
