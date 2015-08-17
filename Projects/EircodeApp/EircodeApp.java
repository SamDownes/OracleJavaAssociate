import java.util.Scanner;

public class EircodeApp {

	public static void main(String[] args) {

		String userInput = null;

		String [] eircodes = new String [10];
		eircodes[0] = "D02Y006";
		eircodes[1] = "D04C932";
		eircodes[2] = "D15XR2R";
		eircodes[3] = "D03RR27";
		eircodes[4] = "D24H510";
		eircodes[5] = "D02XE81";
		eircodes[6] = "D02P656";
		eircodes[7] = "";
		eircodes[8] = "";
		eircodes[9] = "";


		String [] addresses = new String [10];
		addresses[0] = "5 Merrion Square North, Dublin 2";
		addresses[1] = "10 Burlington Road, Dublin 4";
		addresses[2] = "Dunsink Observatory, Dunsink Lane, Dublin 15";
		addresses[3] = "26 Kincora Road, Clontarf, Dublin 3";
		addresses[4] = "Partas, 4A Brookfield Enterprise Centre, Dublin 24";
		addresses[5] = "HODGES FIGGIS, 56-58 DAWSON STREET, Dublin 2";
		addresses[6] = "CENTRAL BANK OF IRELAND, DAME STREET, Dublin 2";
		addresses[7] = "";
		addresses[8] = "";
		addresses[9] = "";

		

		String tempAddress1 = addresses[7];
		String tempEircode1 = eircodes[7];
		String tempAddress2 = addresses[8];
		String tempEircode2 = eircodes[8];
		String tempAddress3 = addresses[9];
		String tempEircode3 = eircodes[9];



		// Import the scanner and create an object reference variable called scan
		Scanner scan = new Scanner(System.in);


		// Provide a user menu to enter their eircode

		CodeEntryLoop: // The main loop for the userInput and return variables
			for(int i = 0; i < eircodes.length; i++){
				System.out.println("--Welcome--");
				System.out.println("\nPlease Enter your eircode OR");
				System.out.println("Enter an area code to see the addresses in that area OR");
				System.out.println("Enter part of your address to see your eircode and full address OR");
				System.out.println("Press 4 to enter your own custom eircode and addresses (maximum 3)");

				userInput = scan.nextLine();


				// These if statements will handle full eircodes being entered and matching the eircodes array by returning addresses from the array addresses

				if(userInput.equalsIgnoreCase(eircodes[0])){
					System.out.println("Your address is " + addresses[0]);
					continue CodeEntryLoop;
				}else if(userInput.equalsIgnoreCase(eircodes[1])){
					System.out.println("Your address is " + addresses[1]);
					continue CodeEntryLoop;
				}else if(userInput.equalsIgnoreCase(eircodes[2])){
					System.out.println("Your address is " + addresses[2]);
					continue CodeEntryLoop;
				}else if(userInput.equals(eircodes[3])){
					System.out.println("Your address is " + addresses[3]);
					continue CodeEntryLoop;
				}else if(userInput.equalsIgnoreCase(eircodes[4])){
					System.out.println("Your address is " + addresses[4]);
					continue CodeEntryLoop;
				}else if(userInput.equalsIgnoreCase(eircodes[5])){
					System.out.println("Your address is " + addresses[5]);
					continue CodeEntryLoop;
				}else if(userInput.equalsIgnoreCase(eircodes[6])){
					System.out.println("Your address is " + addresses[6]);
				}else{



					// Use userInput that contains the area code but nothing else to return the addresses available for that area eg D02
					if(userInput.toUpperCase().contains("D02")){
						System.out.println("These are the addresses available for that code:" 
								+ "\n" + addresses[0] 
										+ "\n" + addresses[5]
												+ "\n" + addresses[6]);
					}else if(userInput.toUpperCase().contains("D03")){
						System.out.println("These are the addresses available for that code:"
								+ "\n" + addresses[3]);
					}else if(userInput.toUpperCase().contains("D04")){
						System.out.println("These are the addresses available for that code:"
								+ "\n" + addresses[1]);
					}else if(userInput.toUpperCase().contains("D15")){
						System.out.println("These are the addresses available for that code:"
								+ "\n" + addresses[2]);
					}else if(userInput.toUpperCase().contains("D24")){
						System.out.println("These are the addresses available for that code:"
								+ "\n" + addresses[4]);
					}else{



						// Finally if users enters the first part of an address in the database, the corresponding eircode and full address if returned


						if(userInput.contains("Merrion".toLowerCase())){
							System.out.println("The eircode and address available for this area is " + eircodes[0] + " " + addresses[0]);
						}else if(userInput.toLowerCase().contains("Burlington".toLowerCase())){
							System.out.println("The eircode and address available for this area is " + eircodes[1] + " " + addresses[1]);
						}else if(userInput.toLowerCase().contains("Dunsink".toLowerCase())){
							System.out.println("The eircode and address available for this area is " + eircodes[2] + " " + addresses[2]);
						}else if(userInput.toLowerCase().contains("Kincora".toLowerCase())){
							System.out.println("The eircode and addresss available for this area is " + eircodes[3] + " " + addresses[3]);
						}else if(userInput.toLowerCase().contains("Partas".toLowerCase())){
							System.out.println("The eircode and address available for this area is " + eircodes[4] + " " + addresses[4]);
						}else if(userInput.toLowerCase().contains("Hodges".toLowerCase())){
							System.out.println("The eircode and address available for this area is " + eircodes[5] + " " + addresses[5]);
						}else if(userInput.toLowerCase().contains("Central".toLowerCase())){
							System.out.println("The eircode and address available for this area is " + eircodes[6] + " " + addresses[6]);
						}else{


							// If a user wishes to enter their own eircodes and addresses and selected 4 at the menu they may do so 3 times and are returned their own userInput
							if(userInput.equals("4")){
								System.out.println("Please enter your own eircodes and addresses (maximum 3) to search the database\n");
								System.out.println("Enter your first eircode");
								tempEircode1 = userInput = scan.nextLine();
								System.out.println("Enter your first address");
								tempAddress1 = userInput = scan.nextLine();
								System.out.println("Enter your second eircode");
								tempEircode2 = userInput = scan.nextLine();
								System.out.println("Enter your second address");
								tempAddress2 = userInput = scan.nextLine();
								System.out.println("Enter your third eircode");
								tempEircode3 = userInput = scan.nextLine();
								System.out.println("Enter your third address");
								tempAddress3 = userInput = scan.nextLine();
							}else{
								System.out.println("Invalid code! Please enter a valid 7 digit code");
								System.out.println(userInput);
								continue CodeEntryLoop;
							}

							if(!userInput.isEmpty()){
								System.out.println("Your first eircode and address is " + tempEircode1 + " " + tempAddress1);
								System.out.println("Your second eircode and address is " + tempEircode2 + " " + tempAddress2);
								System.out.println("Your third eircode and address is " + tempEircode3 + " " + tempAddress3);
								continue CodeEntryLoop;
							}


						}// End of Inner Else code block


					}// End of Outer Else code block

				}// End of Outer Outer Else code block


			}// End of CodeEntryLoop

		scan.close();


	}// End of Main


}// End of EircodeApp
