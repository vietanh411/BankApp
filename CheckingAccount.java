/**
 * Name: Viet Anh Nguyen
 * Course: CS-2163
 * Date: Feb 10, 2023
 * File: CheckingAccount.java
 * Description: 
 */

package java3; 

import java.util.Date;
public class CheckingAccount {
	private String uniqueID;
	private double acctBalance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	public CheckingAccount() {}
	
	public CheckingAccount(String uniqueID, double acctBalance) {
		this.uniqueID = uniqueID;
		this.acctBalance = acctBalance;
	}
	
	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		if (uniqueID.length() >= 4) {
			this.uniqueID = uniqueID;
		}
	}

	public double getAcctBalance() {
		return acctBalance;
	}

	public void setAcctBalance(double acctBalance) {
		if (acctBalance >= 500) {
			this.acctBalance = acctBalance;
		}
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "Account Unique ID: " + uniqueID + "\r\n" 
				+ "Account Creation Date/Time: " + getDateCreated() + "\r\n"
				+ "Balance: $" + acctBalance + "\r\n" 
				+ "Daily Interest Amount: $" + getDailyIntRate() + "\r\n" ;
				
	}
	
	public void depositCash(double deposit) {
		acctBalance += deposit;
	}
	
	public double getDailyIntRate() {
		return (double) Math.round((acctBalance / 365 * (annualInterestRate / 100)) * 100) / 100;
	}
}
 