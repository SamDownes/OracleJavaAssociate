package com.samdownes.projects.banking;

public class PersonalCustomer extends Customer {
	
	private String dateOfBirth;
	private String ppsNumber;
	
	
	public PersonalCustomer(String name, String address, String phoneNumber, Account account, 
			boolean hasOtherAccount, String dateOfBirth, String ppsNumber){
		super(name, address, phoneNumber, account, hasOtherAccount);
		this.dateOfBirth = dateOfBirth;
		this.ppsNumber = ppsNumber;
	}
	
	
	public String toString(){
			return super.toString() + this.dateOfBirth + this.ppsNumber;
	}
	

	
}// End of PersonalCustomer
