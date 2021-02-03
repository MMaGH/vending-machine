package com.task.vendingmachine;


public class App {
	
	public static void main(String[] args) {
		
		IOHandler io = new IOHandler();
		
		int num = io.getNumberInputInRange(1, 5);
		
		io.print(String.valueOf(num));
		
	}
}
