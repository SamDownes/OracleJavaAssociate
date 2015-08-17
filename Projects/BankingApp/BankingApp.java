package com.samdownes.projects.banking;

import java.util.Scanner;
import java.util.ArrayList;


public class BankingApp{

	public static void main(String[] args) {

		BankingApp ba = new BankingApp();
		ba.startApp();
	}


	public void startApp(){

		// First lets create four Objects, one for each account and one for each customer assigning values into the constructor
		CurrentAccount ca = new CurrentAccount(null, 0, 0, 0, false);
		ca = new CurrentAccount("3045670", ca.getRandomAmount(), ca.getRandomAmount(), 2_000, false);

		DepositAccount da = new DepositAccount(null, 0, 0, 0);
		da = new DepositAccount("4560349", da.getRandomAmount(), da.getRandomAmount(), da.getInterest());

		PersonalCustomer pc = new PersonalCustomer("\nName: John Gray", "\nAddress: 14 Val Park", "\nPhone: 01-6537845\n", 
				ca, false, "\nDate-Of-Birth: 31-Oct-1999", "\nPPS Number: 2345791Y\n");
		BusinessCustomer bc = new BusinessCustomer("\nName: Mark Anthony", "\nAddress: 130 Roman Road", 
				"\nPhone: 01-2359671\n", da, true, "\nVAT Num: TR-4578RT\n", true);


		/* Next lets create an ArrayList of type Account to hold all Objects of type Account including the reference variables 
		 * created above
		 */

		ArrayList<Account> accounts = new ArrayList<Account>(100);
		accounts.add(ca);
		accounts.add(da);


		/* Similarly lets create an ArrayList of both customer types and also an ArrayList of Customer Objects to hold these
		 * two new variables
		 */

		ArrayList<BusinessCustomer> businessCustomers = new ArrayList<BusinessCustomer>(100);
		businessCustomers.add(bc);
		ArrayList<PersonalCustomer> personalCustomers = new ArrayList<PersonalCustomer>(100);
		personalCustomers.add(pc);

		ArrayList<Customer> allCustomers = new ArrayList<Customer>(100);
		for(int i = 0; i < 100; i++){
			allCustomers.add(bc);
			allCustomers.add(pc);
		}

		// Provide a menu for the user
		
		System.out.println("----Welcome To The BankingApp----");
		System.out.println("---Please Select From The Menu---");
		System.out.println("1) List all Customers and Accounts");
		System.out.println("2) List all Accounts and Customers");
		System.out.println("3) Audit");
		System.out.println("4) Exit");
	
		
		String userInput = "";
			try(Scanner scan = new Scanner(System.in)){
				userInput = scan.nextLine();
			}catch(Exception e){
				System.out.println("Please enter a valid menu choice");
			}

				switch(userInput){
					case "1": 
					System.out.println(allCustomers.toString() + "\n");
					System.out.println(accounts.toString() + "\n");
					break;

					case "2":
					System.out.println(accounts.toString() + "\n" + allCustomers.toString());
					break;
				
					case "3":
					ca.runAudit();
					bc.runAudit();
					System.out.println("The Customers have been Audited");
					break;
				
					case "4":
					System.out.println("Goodbye, Have a nice day");
					break;
					
					default:
					System.out.println("Please enter a valid menu choice");
					break;
					
				}// End of switch
	

	}// End of StartApp


}// End of BankingApp
