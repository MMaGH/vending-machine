package com.task.vendingmachine;


public class App {
	private static IOHandler io = new IOHandler();
	private static VendingMachine vendingMachine = new VendingMachine();
	
	public static void main(String[] args) {
		
		boolean isRunning = true;
		
		while (isRunning) {
			switch (showMenu()) {
			case 1 :
				vendingMachine.confirmPurchase();
				break;

			default:
				break;
			}
		}
		
	}
	
	
	private static int showMenu() {
		String options =  "1  | Confirm Order \n"
						+ "   | Add Coins"
						+ "    21 | Penny   ( 1￠) \n"
						+ "    22 | Nickel  ( 5￠) \n"
						+ "    23 | Dime    (10￠) \n"
						+ "    24 | Quarter (25￠) \n"
						+ "   | Select Beverage \n"
						+ "    31 | Coke \n"
						+ "    32 | Pepsi \n"
						+ "    33 | Soda \n"
						+ "2  | Cancel Order \n";
		
		io.print(options);
		
		return io.getNumberInputInRange(1, 33);
	}
	
	
	private static void showDetails() {
		String balance = String.valueOf(vendingMachine.getBalance());
		
		io.print(balance);
	}

}
