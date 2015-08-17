package com.samdownes.projects.banking;

public class DepositAccount extends Account {
	
	private double interestRate = 0.04 * 100;
	private double amount = super.getRandomAmount();
	
	
	public DepositAccount(String accountNumber, double transactions, double balance, double interestRate){
		super(accountNumber, transactions, balance);
		this.interestRate = interestRate;		
	}
	
	public double getInterest(){
		double interest = interestRate * amount;
		return interest;
	}

	
	public String toString(){
		return "Account: Deposit Account" + super.toString() + this.interestRate;
	}
	
	
}// End of DepositAccount
