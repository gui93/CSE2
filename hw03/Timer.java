//We must import Scanner to be able to get input from the user
import java.util.Scanner;

public class Timer{ //Creating the Timer class
	public static void main(String[] args){ //Creating the main method
	
		//Creating the Scanner object that will be used to get inputs from the user
		Scanner myScanner = new Scanner( System.in );
		
		// 1. INPUT VARIABLES
		
		//Declaration of the variables that will be used to store the inputs.
		//currentT - will hold the value of the current time in the format HHMM
		//dinnerT - will hold the value of the dinner time in the format HHMM
		int currentT, dinnerT;

		//Prompting the user for the current time and assigning the input to the
		// variable currentT.
		System.out.print("Enter the current time in the format HHMM: ");
		currentT=myScanner.nextInt();
	
		//Prompting the user for the dinner time and assigning the input to the
		// variable dinnerT.
		System.out.print("Enter the time of the dinner in the formar HHMM: ");
		dinnerT=myScanner.nextInt();
	
		// 2. OUTPUT VARIABLES
		
		//Declaration of the variables that will be used to store the outputs.
		//	currentTH, currentTM - will store the current time in HH and MM respectively
		//	dinnerTH, dinnerTM - will store the dinner time in HH and MM respectively
		//	intervalH, intervalM - will store the remaining time in HH and MM respectively
		int currentTH, currentTM, dinnerTH, dinnerTM, intervalH, intervalM;
		
		//Dividing currentT by 100 to get its first two digits only, HH.
		//HH will be assigned to currentTH.
		currentTH=currentT/100 ;
		
		//Multiplying currentTH by 100 will generate a number in a format HH00.
		//By subtracting currentT, HHMM, by currentTH*100, HH00, we end up with MM.
		//MM is assigned to currentTM.
		currentTM=currentT-currentTH*100;
	
		//The same kind of calculation is used to assign the value of HH of the dinner time
		//	to dinnerTH, and the value of MM to dinnerTM.
		dinnerTH=dinnerT/100 ;
		dinnerTM=dinnerT-dinnerTH*100;
	
		//The result of dinnerTH-currentTH will result in the remaining amount of hours 
		//	until the dinner starts.
		intervalH=dinnerTH - currentTH;
		//The result of dinnerTM-currentTM will result in the remaining amount of minutes
		//	until the dinner starts.
		intervalM=dinnerTM - currentTM;

		// 3. PRINTING OUT THE RESULTS
		//The remaining hour, intervalH, and the remaining minutes, intervalM, will be 
		// printed out to the user.
		System.out.println("The dinner will be in " + intervalH + " hours and " + intervalM + " minutes.");
	
	}//End of the main method.
}//End of the class