/**
 * Name: Viet Anh Nguyen
 * Course: CS-2163
 * Date: Feb 10, 2023
 * File: abc.java
 * Description: 
 */
package java3;

import java.util.Scanner;
import java.util.Date;

public class BankApplication {

	public static void main(String[] args) {
		
		CheckingAccount acc = new CheckingAccount();
		
		Scanner input = new Scanner(System.in);
		
		double annualInterestRate;
		double acctBalance;
		String uniqueID;
		
		System.out.println("MidFirst Banking App");
		do {
			System.out.print("Enter the unique ID: ");
			uniqueID = input.nextLine();
			if (uniqueID.length() < 4) {
			System.out.println("!!!ERROR: unique IDs are at least 4 characters long!!!");
			} 
		} while (uniqueID.length() < 4);
		acc.setUniqueID(uniqueID);
		
		do {
			System.out.print("Enter the initial balance: $");
			acctBalance = input.nextDouble();
			if (acctBalance < 500) {
			System.out.println("!!!ERROR: new accounts need at least $500!!!");
			}
		} while (acctBalance < 500);
		acc.setAcctBalance(acctBalance);
		
		System.out.print("Enter the annual interest rate as a percentage: ");
		annualInterestRate = input.nextDouble();
		acc.setAnnualInterestRate(annualInterestRate);
		
		int selection = 0;
		do {
		System.out.println("=============================\r\n"
				+ "=       OPTIONS 	   =	    \r\n"
				+ "=============================\r\n"
				+ "1. Deposit\r\n"
				+ "2. View Daily Interest Rate\r\n"
				+ "3. View Account Details\r\n"
				+ "4. Exit\r\n"
				+ "Enter your selection");
				
		
		double deposit;
		do {
		selection = input.nextInt();
			if (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
				System.out.println("INVALID SELECTION - TRY AGAIN!");
			}
		} while (selection != 1 && selection != 2 && selection != 3 && selection != 4);
		if (selection == 1) {
				do {
					System.out.println("Enter your deposit amount: ");
					deposit = input.nextDouble();
					if (deposit <= 0) {
						System.out.println("!!!ERROR: deposits must be great than $0!!!");
					}
				} while (deposit <= 0);
				acc.depositCash(deposit);
				System.out.println("New Balance: $" + acc.getAcctBalance());
		}
				
		else if (selection == 2) {
				System.out.println("Your Daily Interest Amount is \n$" + acc.getDailyIntRate());
				}
				
		else if (selection == 3) {
				System.out.println(acc.toString());
				}
				
		else if (selection == 4) {
				System.out.println("\nProgram exiting…");
				System.exit(0);
				}
		} while (true);
	}
}
