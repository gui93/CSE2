//Importing Scanner so we can get input from the user.
import java.util.Scanner;

public class Block{//Creating the class Block
	public static void main(String[] args){	//Creating the main method.
	
		//Creating a Scanner object to get inputs from the user.
		Scanner myScanner = new Scanner( System.in );
		
		// 1. INPUT VARIABLES
		
		//Declaration of variables that will hold the value for width, height and 
		// length of the block.
		double width, height, length;
		
		//Prompting the user to enter the values for the width and assigning it to
		//the variable width.
		System.out.print("Enter the width of the block: ");
		width=myScanner.nextDouble();
		
		//Prompting the user to enter the values for the length and assigning it to
		//the variable length.
		System.out.print("Enter the length of the block: ");
		length=myScanner.nextDouble();
		
		//Prompting the user to enter the values for the height and assigning it to
		//the variable height.
		System.out.print("Enter the height of the block: ");
		height=myScanner.nextDouble();
		
		// 2.OUTPUT VARIABLES
		
		//Declaration of variables that will hold the value for the volume and
		// the surface area of the block.
		double volume, surfArea;
		
		//Calculation of the volume and the surface area by basic mathematical equations.
		volume=width*height*length;
		surfArea=2*width*height+2*width*length+2*height*length;
		
		// 3.PRINTING OUT THE RESULTS
		
		//Printing out the volume of the block.
		System.out.println("The volume of the block is: " + volume);
		//Printing out the surface area of the block.
		System.out.println("The surface area of the block is: " + surfArea);
	}//End of the main method.
}//End of the Block class.