package com.samdownes.projects.banking;

import java.util.Random;

public class Account {
	
	private String accountNumber;
	private double transactions;
	private double balance;
	private final double MIN_AMOUNT = -100_000.0;
	private final double MAX_AMOUNT = 100_000.0;
	
	
	public Account(String accountNumber, double transactions, double balance){
		this.accountNumber = accountNumber;
		this.transactions = transactions;
		this.balance = balance;
	}
	
	public double getRandomAmount(){
		Random rand = new Random();
		double amount = MAX_AMOUNT - MIN_AMOUNT * rand.nextDouble();
		return amount;
	}
	
	
	public String toString(){
		return this.accountNumber + this.transactions + this.balance;
	}
	
	
	
}// End of Account
