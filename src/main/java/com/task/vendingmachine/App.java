package com.task.vendingmachine;

import com.task.vendingmachine.model.Coin;

public class App {
	private static IOHandler io = new IOHandler();
	private static VendingMachine vendingMachine = new VendingMachine();
	
	public static void main(String[] args) {
		
		boolean isRunning = true;
		
		while (isRunning) {
			showDetails();
			switch (showMenu()) {
			case 1 :
				io.print("Purchased: " + vendingMachine.confirmPurchase() + "\n Here is your change("
						 + vendingMachine.getBalance()+ "￠):");
				io.printCoinList(vendingMachine.getChange());
				break;
			case 21:
				vendingMachine.addFund(Coin.PENNY);
				break;
			case 22:
				vendingMachine.addFund(Coin.NICKEL);
				break;
			case 23:
				vendingMachine.addFund(Coin.DIME);
				break;
			case 24:
				vendingMachine.addFund(Coin.QUARTER);
				break;
			case 31:
				vendingMachine.selectBeverage("Coke");
				break;
			case 32:
				vendingMachine.selectBeverage("Pepsi");
				break;
			case 33:
				vendingMachine.selectBeverage("Soda");
				break;
			case 4:
				io.print("Purchase Cancelled, here is your change (" + vendingMachine.getBalance()+"￠):");
				io.printCoinList(vendingMachine.cancelPurchase());
				break;
			default:
				break;
			}
		}
		
	}
	
	
	private static int showMenu() {
		String options =  "1  | Confirm Order \n"
						+ "   | Add Coins \n"
						+ "    21 | Penny   ( 1￠) \n"
						+ "    22 | Nickel  ( 5￠) \n"
						+ "    23 | Dime    (10￠) \n"
						+ "    24 | Quarter (25￠) \n"
						+ "   | Select Beverage \n"
						+ "    31 | Coke \n"
						+ "    32 | Pepsi \n"
						+ "    33 | Soda \n"
						+ "4  | Cancel Order \n";
		
		io.print(options);
		
		return io.getNumberInputInRange(1, 33);
	}
	
	
	private static void showDetails() {
		String balance = String.valueOf(vendingMachine.getBalance());
		String beverage = "none";
		if (vendingMachine.getBeverage() != null) {
			beverage = vendingMachine.getBeverage().getName();
		}
		
		String detailString = "Balance: " + balance + "￠ \n"
				            + "Selected: " + beverage ;
		
		io.print(detailString);
	}

}
