package com.samdownes.projects.sport_team;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class RugbyTeam {


	public static void main (String [] args){
	
		RugbyTeam rt = new RugbyTeam();

		rt.menu();

	}//End of main



	//Create an array of String for 10 teams and 15 players 

	String [][] rugbyTeams = new String [10][15];

	String userInput = "";

	Random rand = new Random();



	// Provide the user a menu to display teams and players

	public void menu(){	

		boolean isRunning = true;

		do{

			System.out.println("--Welcome--");

			System.out.println("1)Display teams");

			System.out.println("2)Display players");

			System.out.println("3)Quit");

			Scanner scan = new Scanner(System.in);

			userInput = scan.nextLine();

				switch(userInput){

					case "1" : runTeams(); break;

					case "2" : runPlayers();

				 	populateTeams();
					
					break;

					case "3" : isRunning = false; System.out.println("Goodbye"); break;

					default : break;

				}
	
		}while(isRunning);

	}


	
	public String Player(){

		String name = "Player Name: Dan Masterly ";		

		String height = " Height: 6 ft";

		String age = " Age: 18";		

		return name + "" + age + "" + height;

	}




	public void populateTeams(){

		for(int i = 0; i < rugbyTeams.length; i++)

			for(int j = 0; j < rugbyTeams[i].length; j++)
					
					rugbyTeams[i][j] = Player();

	}


	public void runTeams(){

		System.out.println("Press 2 to choose a team and view the players");

		int teamChoice = Integer.parseInt(userInput);

			if(teamChoice > 0 && teamChoice < rugbyTeams.length){

				for(int i = 0; i < rugbyTeams.length; i++){
			
					System.out.println(teamChoice + i);

				}		
		
			}

	}


	public void runPlayers(){

		Scanner scan = new Scanner(System.in);		

		System.out.print("Please choose your team");
			
		int teamChoice = Integer.parseInt(scan.nextLine());
		
			if(!(teamChoice > 0 && teamChoice <= rugbyTeams.length)){
				
				System.out.println("There is no such team in list");
				
				return;
			}
			

		System.out.println("These are the players for your chosen team");

			for(int  i = 0; i < rugbyTeams[teamChoice - 1].length; i++){
					
				System.out.println("--Player List--");
					
				System.out.println(rugbyTeams[teamChoice - 1][i]);

			}

	}




}// End of RugbyTeam
