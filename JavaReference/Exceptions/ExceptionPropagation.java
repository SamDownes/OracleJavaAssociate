package com.samdownes.ocja.exceptions;



public class ExceptionPropagation{


	public static void main (String [] args){


		// Create an Object of type ExceptionPropagation
		ExceptionPropagation ep = new ExceptionPropagation();
	
		
		// Run the startProgram method using a try-catch-finally block
		try{
			ep.startProgram();
		}catch(ArithmeticException ae){
			System.out.println("You have caught the exception in the main where the method was called");
		}finally{

			System.out.println("If not caught in the method it occurred, the exception will get passed up here!");
	
		}

		ep.continueProgram();

		

	}


	public void startProgram(){

	
		int i = 24;

		// This sum operation throw an exception and because its' not caught in this method it will be passed up to the main which DOES catch 
		// the appropriate exception ArithmeticException and performs its catch statement before the anything else in the main is run
		
		int sum = i / 0;

		// Never performed
		System.out.println(sum);
	

	}



	public void continueProgram(){

		int [] array = new int[5];

		

		try{

		array[6] = 7;
		
		}catch(ArrayIndexOutOfBoundsException aioobe){
		
		System.out.println("This exception has been caught immediately when it occurred");
		
		}finally{
		
		System.out.println("and will not be passed up to the main!");
		
		}
				
	}


	public void endProgram(){

		String [] stringArray = new String[10];

		
		// This will throw an ArrayIndexOutOfBoundsException however because we have caught the same exception above in the continueProgram method
		// the exception will get passed up and caught and there will be no trouble compiling 
		stringArray[12] = "This is out of bounds!";

	}		



}// End of ExceptionPropagation
