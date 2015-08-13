package com.samdownes.ocja.static_imports;

// When compiling we must specify that we need to look in this directory using -cp "directory of import" in order to import 
import com.samdownes.ocja.other_stuff_for_static.Utility;


public class StaticMain {


	public static void main(String [] args){

		// Call Non-Static Method

		Utility util = new Utility();
	
		util.printSomeNonStatic();


		// Call Static Method	

		Utility.printSomeStatic();



	}// End of Main



}// End of StaticMain
