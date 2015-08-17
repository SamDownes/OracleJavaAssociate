package com.samdownes.projects.banking;

public class Customer {
	
	private String name;
	private String address;
	private String phoneNumber;
	private Account account;
	private boolean hasOtherAccount;
	
	
	public Customer(String name, String address, String phoneNumber, Account account, boolean hasOtherAccount){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.account = account;
		this.hasOtherAccount = hasOtherAccount;
	}
	
	public String toString(){
		return this.name + this.address + this.phoneNumber + this.account + this.hasOtherAccount;
	}
	
	

}// End of Customer
