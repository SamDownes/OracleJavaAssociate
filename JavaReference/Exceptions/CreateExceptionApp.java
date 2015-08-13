package com.samdownes.ocja.exception;


import java.io.IOException;


	
public class CreateExceptionApp {


	public static void main (String [] args){


		CreateExceptionApp cea = new CreateExceptionApp();

		try{

			cea.myCheckedException();

		}catch(IOException ioe){

			System.out.println("You caught the IOException!");

		}

		
		try{

			cea.myUncheckedException();
		
		}catch(NullPointerException npe){

			System.out.println("You caught the NullPointerException!");

		}

	
	}// End of Main


		// This Checked Exception must be thrown by the calling method or dealt with a try-catch
	

		public void myCheckedException() throws IOException{


			throw new IOException();
		
		}

	


		// Unnecessary to throw an Unchecked Exception in the method declaration
	

		public void myUncheckedException() throws NullPointerException {


			throw new NullPointerException();
	
		}

	


}// End of CreateExceptionApp

