/*	Student: Guilherme Junqueira Perticarari 
	LID: 824858244
	Homework 6 - CheckDigit
	Description: This software must receive a 10 digit barcode from the user and check
			 	 whether it is a valid ISBN code or not. A barcode will be valid if:
			 	 	1.	The first~eighth digits are numbers.
			 	 	2.	The weighted sum 10*digit1+...+2*digit9 will be divided by 11. 
			 	 		The remainder of the division is equal to digit10.
			 	 		If the remainder is equal to 10, digit10 must be X. */

import  java.util.Scanner; //Scanner will be used to get the barcode input from the user.
public class CheckDigit{ //Declaration of the CheckDigit class.
	public static void main(String[] args){ //Declaration of the main method.
	
		//Declaring a Scanner object to get input from the user.
		Scanner input = new Scanner(System.in);
				
		//'s' will store the barcode entered by the user.
		String s;
		
		// 'dig1' to 'dig10 will store the digits of the barcode separately. 
		//'w_sum' will store the weighted sum described before on item 2.
		int dig1,dig2,dig3,dig4,dig5,dig6,dig7,dig8,dig9,dig10,w_sum=0;
		
		//This variable will be useful for the software to know whether to move on
		//or to break and ask the user for a valid barcode.
		boolean enable=true;
		
		//Prompting the user for a barcode.
		System.out.print("Enter a 10 digit barcode: ");
			
		//This loop statement will be useful to go back to get the user input in case
		//of an invalid barcode.
		while(true){
		
			//Storing the input in the 's' variable.
			s=input.nextLine();
			
			//Checking if the length of the input is greater than 10 characters, because
			//otherwise, it will not be a valid barcode.
			if(s.length()==10){
			
				//These loop statements will check if digit1~digit9 contain letters.
				//If they do, it's a invalid barcode and, so, enable will receive 'false'.
				//The conversion between chars and ints is stated below:
				// 65-A
				// 66-B
				// ...
				// 122-z
				//'s.charAt(x)' returns the equivalent char in the xth digit of the string.
				for(int i=65;i<=122;i++){
					for(int count=0;count<=8;count++){
						if(s.charAt(count)==(char)i){
							enable=false;
						}
					}
				}
				
				//If there are no letters in the first 9 digits of the barcode, the 
				//previous test will return enable=true(the value it was declared with), 
				//and so, the software will move on to the next tests.
				if(enable){
				
					//These next command will check if the last digit of the barcode
					//is valid or not.
					//As in the previous statement, it will check if the last digit is 
					//a letter.
					//If it is, and the last digit is 'x' or 'X', 'dig10' will store 
					//the value 10.
					//If it is, and the last is neither 'x' nor 'X', enable will store
					//the value 'false'.
					//If it is not, then dig10 will remain with the numeric value of it.
					//The subtraction (-48) is explained on line 92.
					dig10=(int)(s.charAt(9)-48);
					for(int i=65;i<=122;i++){
						if(s.charAt(9)==(char)i){
							if(s.charAt(9)=='x'||s.charAt(9)=='X'){
								dig10=10;
							}
							else{
								enable=false;
							}
						}
					}
					
					//If the last digit is a valid character (numbers, 'x', or 'X'),
					// enable will remain true, and so, this if-statement will be accessed.
					if(enable){
					
						//The digits 1 to 9 will be assigned to the corresponding variables.
						//48 is subtracted of (int)(s.charAt(0)) because of the following relation:
						// If char x is 1, then (int)x is 49
						// If char x is 2, then (int)x is 50, and so on.
						//Because of that, we subtract 48 of the int converted char.
						dig1=(int)(s.charAt(0))-48;	
						dig2=(int)(s.charAt(1))-48;
						dig3=(int)(s.charAt(2))-48;	
						dig4=(int)(s.charAt(3))-48;
						dig5=(int)(s.charAt(4))-48;	
						dig6=(int)(s.charAt(5))-48;
						dig7=(int)(s.charAt(6))-48;	
						dig8=(int)(s.charAt(7))-48;
						dig9=(int)(s.charAt(8))-48;
						
						//The weighted sum is evaluated.
						w_sum=10*dig1+9*dig2+8*dig3+7*dig4+6*dig5+
													5*dig6+4*dig7+3*dig8+2*dig9;
													
						//The 2nd condition is checked. If it's true, it's a valid barcode.
						//If it isn't, the user must enter another one.
						if(w_sum%11==dig10){
							System.out.println("This is a valid barcode");
							break;
						}
						else{
							if(w_sum%11==10){
								System.out.println("Invalid input. The last digit should be X.\n Try again: ");
							}
							else{
								System.out.print("Invalid input." +
												"The last digit should be: "+
											 	w_sum%11+ "\n Try again: ");
							}
						}
					}
				}
				
				else{
					//Line to be executed if there are letter among the first 9 digits.
					System.out.print("Invalid ISBN. The first 9 digits should be numbers.\nTry again: ");	
				}
			}
			
			else {
				//Line to be executed if there are more than 10 digits in the barcode.
				System.out.print("Invalid ISBN. \nEnter a 10-digit barcode: ");
			}
			
		//End of the while-statement.
		}
	}
}