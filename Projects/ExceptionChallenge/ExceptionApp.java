
import java.util.Scanner;


public class ExceptionApp {


	public static void main (String [] args){

	ExceptionApp ea = new ExceptionApp();

	ea.startProgram();	


	}


	public void startProgram(){

		System.out.println("Hello world!");

		Scanner scan = new Scanner(System.in);

		System.out.println("--Welcome to the ExceptionApp--");
		
		boolean isRunning = false;		

			do{

				try{

					System.out.println("Please enter your name");
	
					String userName = scan.nextLine();

					validateName(userName);

					isRunning = false;

			
				}catch(InvalidNameException ine){

					System.out.println("Please enter a valid name including spaces");

					isRunning = true;
				
					
				}

			
			}while(isRunning);
				

		
			do{
				
				try{

					System.out.println("Please enter your PPS Number");

					String userPPS = scan.nextLine();
					
					validatePPSNumber(userPPS);

					isRunning = false;


				}catch(InvalidPPSException ipe){

					System.out.println("Please enter a valid PPS Number!");

					isRunning = true;
			
				}

			
			}while(isRunning);


					

	}// End of startProgram




// Create Checked Exception for InvalidPPS number

class InvalidPPSException extends Exception{

		public InvalidPPSException(){
	
			super();

		}

		public InvalidPPSException(String message){

			super(message);

		}

}


// Create Checked Exception for InvalidName 

class InvalidNameException extends Exception{

		public InvalidNameException(){

			super();

		}

		public InvalidNameException(String message){

			super(message);		

		}
		
}


// Create a method to validatePPSNumber to be 8 digits long throwing the Exception for InvalidPPS

private void validatePPSNumber(String pps) throws InvalidPPSException{
		
		for(int i = 0; i < pps.length(); i++){		

			if(pps.length() != 8){
							
			throw new InvalidPPSException("Please enter a valid PPS Number");

			}
		
		}

}


// Create a method to validateName including spaces throwing the Exception for InvalidName

private void validateName(String name) throws InvalidNameException{

		for(int i = 0; i < name.length(); i++){
			
			if( ! name.contains(" ")){
			
			throw new InvalidNameException("Please enter a valid name");

			}
		
		}

}


}// End of ExceptionApp
