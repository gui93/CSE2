//Scanner will be used to get the barcode input from the user.
import  java.util.Scanner;

//Declaring the class StringAnalysis.
public class StringAnalysis{
	
	//Method that will analyse 'n' characters of the string 's'.
	//If any of them is not a letter, the program will return 'false'.
	public static boolean Analyse(String s, int n){
	
		//Iteration through 'n' characters of the string 's'.
		for(int i=0;i<n;i++){
		
			//If any of them is not between 'a' and 'z', the method will return false'.
			if(s.charAt(i)<'a' || s.charAt(i)>'z'){
				return false;
			}
		}
		//If the method continues after iterating through the 'n' characters, it means
		//	that all of them are letters. Therefore, the method returns true.
		return true;
	}
	
	//This method will analyse all of the characters of the string 's'.
	//It will basically run the previous method and use 
	//'s.length()' (the length of the string) as the variable 'n'.
	public static boolean Analyse(String s){
		return Analyse(s,s.length());
	}
	
	//Main method.
	public static void main(String[] args){
		
		//Variable that will be used to keep the software in a loop if
		// the user doesn't enter a valid input.
		boolean enable=true;
		
		//Declaring a myScanner object to get input from the user.
		Scanner myScanner = new Scanner(System.in);
		
		//Prompting the user to enter a string.
		System.out.print("Enter a string: ");
		String s=myScanner.nextLine();
		
		//Asking the user to choose whether he wants the software to analyse all 
		// characters of the string or just a specific number of them.
		System.out.print("Do you want to to examine all the characters? [y/n]: ");
		
		//This loop will go on until the user types 'y' or 'n'.
		while(enable){
		
			//Getting the input from the user.
			char ans=myScanner.next().charAt(0);
			
			//The if-statement is going to run if the user's entered 'y'.
			if(ans=='y'){
			
				//'enable' will receive 'false' and, therefore,
				// the loop will be broken.
				enable=false;
				
				//The if-statement is going to run if Analyse(s) returns true, i.e. when 
				// all of the characters are letters.
				if(Analyse(s)){
					System.out.println("They are all letters!");	
				}
				
				//The else-statement is going to run if Analyse(s) return false, i.e. when
				// there's at least one character that is not a letter.
				else{
					System.out.println("They are not all letters!");
				}
			}
			
			//The else-if-statement is going to run if the user's entered 'n'.
			else if(ans=='n'){
			
				//'enable' will receive 'false' and, therefore,
				// the loop will be broken.
				enable=false;
				
				//Prompting the user how many characters he/she wants to analyse.
				System.out.print("How many characters do you want to analyse?: ");
				int n=myScanner.nextInt();
				
				//The if-statement is going to run if Analyse(s) returns true, i.e. when 
				// the 'n' first characters are letters.
				if(Analyse(s,n)){
					System.out.println("The first " + n + " characters are all letters!");	
				}
				
				//The else-statement is going to run if Analyse(s) return false, i.e. when
				// there's at least one character that is not a letter in the 'n' first characters.
				else{
					System.out.println("The first " + n + " characters are not all letters!");	
				}
			}
			
			//The else-statement will run if the user's entered something other than 'y' or 'n'.
			// He/She will be prompted to enter the answer again.
			else{
				System.out.print("Please, type either y or n: "); 
			}
		}
	}
}