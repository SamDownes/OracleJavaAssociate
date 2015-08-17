package com.samdownes.projects.banking;

public class BusinessCustomer extends Customer implements Auditable{
	
	private String vatNumber;
	private boolean hasTaxClearance;
	
	
	public BusinessCustomer(String name, String address, String phoneNumber, Account account,
			boolean hasOtherAccount, String vatNumber, boolean hasTaxClearance){
	super(name, address, phoneNumber, account, hasOtherAccount);
	this.vatNumber = vatNumber;
	this.hasTaxClearance = hasTaxClearance;
	}
		
	public boolean runAudit(){
		if(hasTaxClearance){
			return "Tax Cleared: " + true != null;
		}else{
			return false + "This customer is due for audit" != null;
		}
		
	}
	public String toString(){
		return super.toString() + this.vatNumber + this.hasTaxClearance;
	}

	
	
}// End of BusinessCustomer
