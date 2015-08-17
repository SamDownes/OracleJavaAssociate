package com.samdownes.projects.banking;

public class CurrentAccount extends Account implements Auditable{

	private double maxOverDraw;
	private boolean chequeBookIssued;
	private double amount = super.getRandomAmount();
	
	
	public CurrentAccount(String accountNumber, double transactions, double balance, double maxOverDraw, boolean chequeBookIssued){
		super(accountNumber, transactions, balance);
		this.maxOverDraw = maxOverDraw;
		this.chequeBookIssued = chequeBookIssued;
	}
	
	public boolean runAudit(){
		if(this.amount < 0){
			return true;
		}else{
			return false;
		}
		
	}
	
	public String toString(){
		return "Account: Current Account" + super.toString() + this.maxOverDraw + this.chequeBookIssued;
	}
	
	
}// End of CurrentAccount
