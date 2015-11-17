/*	Student: Guilherme Junqueira Perticarari 
	LID: 824858244
	Homework 12 - Transpose
	Date: 11/17/2015
	Description: The software is going to prompt the user to enter values for
					the height and the width of a matrix.
				Afterwards, a random matrix with the specified dimensions
				and with values from -10 to 10 is going to be generated.
				The matrix is going to be printed, transposed and then, printed again.
*/


//Importing Scanner to get input from the user.
import java.util.Scanner;

//Declaring the Transpose class.
public class Transpose{
	
	//Method randomMatrix(int,int).
	public static int[][] randomMatrix(int width, int height){
	
		//Creating the multidimensional array 'matrix'.
		//'matrix' is going to be returned at the end of the method.
		int[][] matrix=new int[height][width];
		
		//'matrix' is going to be iterated row-by-row.
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				//A random number between -10 and 10 is generated.
				int random=(int)(Math.random()*20)-10;
				
				//'matrix[i][j]' is going to received the random number.
				matrix[i][j]=random;
			}
		}
		
		//At the end, 'matrix', that is now filled with numbers, is going to be returned.
		return matrix;
	}
	
	//Method printMatrix(int[][]).
	public static void printMatrix(int[][] matrix){
	
		//This variable will be used to check whether the input is rectangular.
		boolean e=true;;
		
		//'length' will store the length of the first member array.
		int length=matrix[0].length;
		
		//If all member-array have the same length, 'e' is going to be true. 
		//Otherwise, 'e' is going to be false.
		for(int i=0;i<matrix.length;i++){
			if(length!=matrix[i].length){
				e=false;
				break;
			}
		}
		
		//This loop is going to run if 'matrix' is rectangular.
		if(e){
		
			//Printing out the entire array row by row.
			for(int i=0;i<matrix.length;i++){
				for(int j=0;j<matrix[i].length;j++){
				
					//Statements to stylize the way the numbers will appear.
					if(matrix[i][j]<0){
						System.out.print(matrix[i][j]+" ");
					}
					else{
						System.out.print(" "+ matrix[i][j]+" ");
					}
				}
				
				//Beginning of the next row.
				System.out.println();
			}
		}
		//This loop is going to run if 'matrix' is not rectangular.
		else{
			System.out.println("The matrix is not rectangular!");
		}
	}
	
	//Method transposeMatrix(int[][]).
	public static int[][] transposeMatrix(int[][] matrix){
		//Creating the matrix 'transposed'.
		//It's going to have the inverted dimensions that 'matrix' has.
		int[][] transposed=new int[matrix[0].length][matrix.length];
		
		//Iterating through 'transposed'.
		//In each iteration, 'transposed[i][j]' will receive 'matrix[j][i]'.
		for(int i=0;i<transposed.length;i++){
			for(int j=0;j<transposed[i].length;j++){
				transposed[i][j]=matrix[j][i];
			}
		}
		
		//'transposed' is going to be returned.
		return transposed;
	}
	
	
	//Main method.
	public static void main( String args[] ){
	
		//Creating a Scanner object to get inputs from the user.
		Scanner myScanner=new Scanner(System.in);
		
		//Creating the variables 'width' and 'height'.
		int width=0, height=0;
		
		//Prompting the user to enter the width.
		System.out.print("Enter the width of the matrix: ");
		
		//This loop is going to run until the user has enter a valid input.
		while(true){
			
			//Checking to see if the input is an int.
			while (myScanner.hasNext()) {
			
				//If it is, 'width' will receive it.
  				if(myScanner.hasNextInt()){
  					width=myScanner.nextInt();
  					break;
				}
				
				//Otherwise, the software is going to ask the user to enter another input.
				else{
					System.out.print("ERROR! Please, enter an int: ");
					myScanner.next();
				}
			}
			
			//Checking to see if the input is greater than 0.
			//If it's not, the software will prompt the user again to enter a positive number.
			if(width<=0){
				System.out.print("ERROR! Please, enter a positive number: ");
			}
			else{
				break;
			}
		}
		
		//The same reasoning behind getting the 'width' input will be
		// applied to the height.
		System.out.print("Enter the height of the matrix: ");
		while(true){
			while (myScanner.hasNext()) {
  				if(myScanner.hasNextInt()){
  					height=myScanner.nextInt();
  					break;
				}
				else{
					System.out.print("ERROR! Please, enter an int: ");
					myScanner.next();
				}
			}
			if(height<=0){
				System.out.print("ERROR! Please, enter a positive number: ");
			}
			else{
				break;
			}
		}
		
		//Printing out the final values for 'height' and 'width'.
		System.out.println("Height: "+height+" Width: " +width);
		
		//Creating a randomMatrix with the specified dimensions.
		int[][] matrix=randomMatrix(width,height);
		
		//Printing out the matrix.
		System.out.println("Original matrix: ");
		printMatrix(matrix);
		
		//Creating the transposed matrix.
		int[][] matrix_t=transposeMatrix(matrix);
		
		//Printing out the transposed matrix.
		System.out.println("Transposed matrix: ");
		printMatrix(matrix_t);
		
	}   
}