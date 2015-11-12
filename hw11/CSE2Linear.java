/*	Student: Guilherme Junqueira Perticarari 
	LID: 824858244
	Homework 11 - CSE2Linear
	Description: The program will get inputs from the user to fill up an int array.
				  The user must receive error messages if:
				  		1)The input is not an integer.
				  		2)The input is less than 0 or greater than 100. 
				  		3)The integer entered is not equal to or greater than the last one.
				  The user will be promped to enter a grade he wants to look for linearly in the array.
				  The program LinearSearch will be called and show how many iterations it took
				  to perform the task.
				  The array will be scrambled and then, the user will be asked to enter another grade.
				  The program LinearSearch will be called again and will perform the same exact function
				  as before.
*/

//Scanner will be used to get inputs from the user.		
import java.util.Scanner;

//Random will be used to generate a random number.
import java.util.Random;

//Declaring the class CSE2Linear
public class CSE2Linear{ 
	
	//Method for the BinarySearch.
	public static void BinarySearch(int[] array,int search){
		//'n' will store the number of iterations.
	 	int n=1;
	 	
	 	//'lower' will store the lower bound of the interval where 'search' might be.
	 	int lower=0;
	 	
	 	//'upper' will store the upper bound of the interval where 'search' might be.
	 	int upper=array.length-1;
	 	
	 	//'i' will store the middle point between 'lower' and 'upper'.
	 	int i;
	 	
	 	//If the grade is found, the last line (The grade was not found!) will not be displayed.
	 	//If the grade is not found, the last line will be displayed.
	 	boolean e=true;
	 	
	 	//After every iteration that search is not found, lower and upper will 
	 	//	will get closer together by unitary steps.
	 	//If the number is not found, 'upper' will eventually get smaller than 'lower'.
	 	//This while-loop will go on until one of these things happen:
	 	//	1) 'i' holds the position of the number searched in the array.
	 	//	2)	upper gets smaller than lower.
   		while(upper>=lower){
  			i=(int)(0.5*(lower+upper));
  			if(array[i]<search){
   	   			lower=i+1;
    	    }
  			if(array[i]==search) {
  	    		System.out.println("The grade was found after " + n + " iterations!");
  	    		e=false;
  	    		break;
  	    	}
  	    	if(array[i]>search){
   	   			upper=i-1;
    	    }
		//The number of iterations is increased unitarily.
    	n++;
  	 	}
  	 	if(e){
   			System.out.println("The grade was not found!");
   		}
   }
	
	//Method that will be used to get inputs from user and fill up the grade array.
	public static void GetArray(int[] array, Scanner input){
	
		//Control variable that will keep the program in a loop until
		//the user enters a valid input.
		boolean e;
		int temp=0;
		
		//Prompting the user to fill up the array.
		for(int i=0; i<array.length;i++){
			e=true;
			
			//These statements are just prompting the user to enter the i-th grade.
			if(i==0){
				System.out.print("Enter the first grade: ");
			}
			else if(i==1){
				System.out.print("Enter the second grade:");
			}
			else if(i==2){
				System.out.print("Enter the third grade:");
			}
			else{
				System.out.print("Enter the " + (i+1) + "th grade:");
			}
			
			//The program will be in a loop until the user enters a valid input.
			while(e){
				
				//Loop that will go on until the user enters an int.
				while(!input.hasNextInt()) {
					System.out.print("ERROR!\nPlease, enter an integer: ");
    				input.next();
				}
				
				//'temp' will receive the input (that we now know it's an int).
				temp = input.nextInt();		
				
				//'temp' will be tested.
				//First, if it's between 0 and 100.
				//Second, if it's grater than the previous integer.
				if(temp<0 || temp>100){
					e=true;
					System.out.print("ERROR!\nType a grade between 0 and 100: ");
				}
				else if(i>0){
					if(temp<array[i-1]){
						e=true;
						System.out.print("ERROR!\nType an integer that is grater than or equal to the last one: ");
					}
					else{
						e=false;
					}
				}
				else{
					e=false;
				}
			}
			
			//After the input meets all the specifications, array[i] will receive it.
			array[i]=temp;		
		}
	}
	
	//Method that will be used to do a linear search in the array looking
	// for the integer 'search'.
	public static void LinearSearch(int[] array, int search){
		
		//Variable that will count the number of iterations.
		int n=1;
		
		boolean e=true;
		//The for-loop will go on until array[i] is equal to the variable 'search', with n being increased
		// at the end of each iteration. 
		//If 'search' is found, the user will be show how many iterations it took to find it 
		//	and the loop will be broken.
		//If 'search' is not found (e<-false), the program will print "The grade was not found".
		for(int i=0;i<array.length;i++,n++){
			if(array[i]==search){
				e=false;
				System.out.println("The grade was found after " + n + " iterations.");
				break;
			}

		}
		if(e){
			System.out.println("The grade was not found!");
		}
	}
	
	//Method that will scramble the array randomly.
	public static void Scramble(int[] array, Random r){
		//'temp' will be used to swap values between the array's positions.
		//'random' will be used to store a random number between 0 and 15.
		int temp,random;
		
		//In each iteration, a new random variable, 'random', between 0 and 15 will be generated.
		//	The i-th position's value of the array will be swapped with the random-th position.
		for(int i=0;i<array.length;i++){
			random=r.nextInt(array.length);
			temp=array[i];
			array[i]=array[random];
			array[random]=temp;
		}
	}
	
	//Declaring the main method.
	public static void main(String[] args){
		//'input' will be used to get inputs from the user.
		Scanner input = new Scanner(System.in);
		
		//'n' will hol the length of the array.
		//'search' will receive the grade entered by the user that is to be
		// searched in the array.
		int n=15, search;
		
		//'r' will be used to generate a random number in the method 'Scramble'.
		Random r=new Random();
		
		//Declaring the array that will hold all the grades.
		int[] array=new int[n];
		
		//Method that will prompt the user to enter all the grades in a valid way.
		GetArray(array, input);
		
		//Printing out the array.
		System.out.println("The grades are: ");
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
		
		//Prompting the user to enter a grade to be searched in the array.
		System.out.println();
		System.out.print("BINARY SEARCH:\nWhich grade do you wanna search?: ");
		search=input.nextInt();
		
		//Method that will search the value entered by the user in the array with Binary Search.
		BinarySearch(array,search);
		
		//The original array will be scrambled.
		Scramble(array,r);
		
		//The scrambled array will be printed out to the user.
		System.out.println("The scrambled grades are: ");
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
		
		//The user will be prompt to enter another grade.
		System.out.println();
		System.out.print("LINEAR SEARCH:\nWhich grade do you wanna search?: ");
		search=input.nextInt();
		
		//The value entered will be searched in the new array.
		LinearSearch(array,search);

	}
}