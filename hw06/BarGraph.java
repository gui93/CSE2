/*	Student: Guilherme Junqueira Perticarari 
	LID: 824858244
	Homework 6 - BarGraph
	Description:  The user must enter the expenses for each day of the week.
	              The software will analyze whether the value entered is valid, it will 
	              also find an average daily expense and estimate a total expense after
	              4 years.
                    */
			 	 		
import  java.util.Scanner;//Scanner will be used to get the barcode input from the user.
public class BarGraph{ //Declaration of the CheckDigit class.
	public static void main(String[] args){ //Declaration of the main method.
	
		//Declaring a Scanner object to get input from the user.
		Scanner input = new Scanner(System.in);
		
		//The following variables will store the values for expenses.
		//
		//valueM - value entered for Monday.
		//valueTu - value entered for Tuesday, and so on.
		//The inputs will be stored as strings, the strings will be analyzed and, after
		//the values are tested to be valid, they will be stored to the corresponding
		//double variables.
		String valueM, valueTu, valueW, valueTh, valueF, valueSat, valueSun;
		
		double ivalueM, ivalueTu, ivalueW, ivalueTh, 
		ivalueF, ivalueSat, ivalueSun, sum, av;
		
		//Variable that will be used to count the number of *-characters for each day.
		int n;
		
		//This variable will be useful for the software to know if it should move on or
		//ask the user for a valid number.
		boolean status=true;
		
		//Prompting the user to enter the value for each day.
		System.out.println("Please, type in your expenses for the following days of the week: ");
		System.out.print("Monday: $");
		
		//This while-loop will keep on going until the user has entered valid numbers.
		while(true){
			status=true;
			//Getting the input from the user as a string.
			valueM = input.nextLine();
			
			//These loop statements will check if the string contains letters.
			//If it does, it's a invalid number and, so, 'status will receive 'false'.
			//The conversion between chars and ints is stated below:
			// 65-A
			// 66-B
			// ...
			// 122-z
			//'s.charAt(x)' returns the equivalent char in the xth digit of the string.
			for(int i=65;i<=122;i++){
				for(int j=0;j<valueM.length();j++){
					if(valueM.charAt(j)==(char)i){
						status=false;
					}
				}
			}
			
			//If the previous test went well (status is still equal to 'true'),
			//the program moves on.
			if(status){
				//The value of the string that hold the user's input will be stored
				//as a double to it's corresponding variable.
				ivalueM=Double.parseDouble(valueM);
				if(ivalueM<0){
					//If the value entered is negative, the user will be asked to enter a 
					// new number.
					System.out.print("Invalid number!\nTry again: $");

				}
				else{
					//If the value is positive, the program moves on.
					break;
				}
			}
			//If the previous test didn't go well (status is equal to 'false'), the user
			//will be asked to enter another number.
			else{
				System.out.print("Invalid number!\nTry again: $");
			}
		}
		
		//The exact same pattern is repeated on and on until Sunday.

		System.out.print("Tuesday: $");
		while(true){
			status=true;
			valueTu = input.nextLine();
			for(int i=65;i<=122;i++){
				for(int j=0;j<valueTu.length();j++){
					if(valueTu.charAt(j)==(char)i){
						status=false;
					}
				}
			}
			if(status){
				ivalueTu=Double.parseDouble(valueTu);
				if(ivalueTu<0){
					System.out.print("Invalid number!\nTry again: $");

				}
				else{
					break;
				}
			}
			else{
				System.out.print("Invalid number!\nTry again: $");
			}
		}
		System.out.print("Wednesday: $");
		while(true){
			status=true;
			valueW = input.nextLine();
			for(int i=65;i<=122;i++){
				for(int j=0;j<valueW.length();j++){
					if(valueW.charAt(j)==(char)i){
						status=false;
					}
				}
			}
			if(status){
				ivalueW=Double.parseDouble(valueW);
				if(ivalueW<0){
					System.out.print("Invalid number!\nTry again: $");

				}
				else{
					break;
				}
			}
			else{
				System.out.print("Invalid number!\nTry again: $");
			}
		}
		System.out.print("Thursday: $");
		while(true){
			status=true;
			valueTh = input.nextLine();
			for(int i=65;i<=122;i++){
				for(int j=0;j<valueTh.length();j++){
					if(valueTh.charAt(j)==(char)i){
						status=false;
					}
				}
			}
			if(status){
				ivalueTh=Double.parseDouble(valueTh);
				if(ivalueTh<0){
					System.out.print("Invalid number!\nTry again: $");

				}
				else{
					break;
				}
			}
			else{
				System.out.print("Invalid number!\nTry again: $");
			}
		}
		System.out.print("Friday: $");
		while(true){
			status=true;
			valueF = input.nextLine();
			for(int i=65;i<=122;i++){
				for(int j=0;j<valueF.length();j++){
					if(valueF.charAt(j)==(char)i){
						status=false;
					}
				}
			}
			if(status){
				ivalueF=Double.parseDouble(valueF);
				if(ivalueF<0){
					System.out.print("Invalid number!\nTry again: $");

				}
				else{
					break;
				}
			}
			else{
				System.out.print("Invalid number!\nTry again: $");
			}
		}
		System.out.print("Saturday: $");
		while(true){
			status=true;
			valueSat = input.nextLine();
			for(int i=65;i<=122;i++){
				for(int j=0;j<valueSat.length();j++){
					if(valueSat.charAt(j)==(char)i){
						status=false;
					}
				}
			}
			if(status){
				ivalueSat=Double.parseDouble(valueSat);
				if(ivalueSat<0){
					System.out.print("Invalid number!\nTry again: $");

				}
				else{
					break;
				}
			}
			else{
				System.out.print("Invalid number!\nTry again: $");
			}
		}
		System.out.print("Sunday: $");
		while(true){
			status=true;
			valueSun = input.nextLine();
			for(int i=65;i<=122;i++){
				for(int j=0;j<valueSun.length();j++){
					if(valueSun.charAt(j)==(char)i){
						status=false;
					}
				}
			}
			if(status){
				ivalueSun=Double.parseDouble(valueSun);
				if(ivalueSun<0){
					System.out.print("Invalid number!\nTry again: $");

				}
				else{
					break;
				}
			}
			else{
				System.out.print("Invalid number!\nTry again: $");
			}
		}
		
		//The variable 'av' will hold the average daily expense.
		sum=ivalueM+ivalueTu+ivalueW+ivalueTh+ivalueF+ivalueSat+ivalueSun;
		av=sum/7;
		
		//The values are now rounded.
		ivalueM=Math.round(ivalueM);
		ivalueTu=Math.round(ivalueTu);
		ivalueW=Math.round(ivalueW);
		ivalueTh=Math.round(ivalueTh);
		ivalueF=Math.round(ivalueF);
		ivalueSat=Math.round(ivalueSat);
		ivalueSun=Math.round(ivalueSun);
		
		//Printing out the rounded value for each day of the week as * characters.
		System.out.print("Monday: ");
		for(n=0;n<ivalueM;n++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("Tuesday: ");
		for(n=0;n<ivalueTu;n++){
			System.out.print("*");
		}
		System.out.println();
		
		
		System.out.print("Wednesday: ");
		for(n=0;n<ivalueW;n++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("Thursday: ");
		for(n=0;n<ivalueTh;n++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("Friday: ");
		for(n=0;n<ivalueF;n++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("Saturday: ");
		for(n=0;n<ivalueSat;n++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("Sunday: ");
		for(n=0;n<ivalueSun;n++){
			System.out.print("*");
		}
		System.out.println();
	
		//A random number in the range of [-20,20] will be generated for each week.
		//With it, a percentage of fluctuation will be found for each week.
		//Finally, it'll sum up the total expense for 4 years (4*52 weeks).
		double rand=0, percent=0, total=0;
		for(int weeks=1;weeks<=4*52;weeks++){
			rand=(int)(Math.random()*40)-20;
			percent=(rand/100)+1;
			total=total+7*av*percent;
		}
		
		//Printing out the results.
		System.out.println("Your average daily expenses are: " + Math.round(av*100.00)/100.00);
		System.out.println("Your total expenses in 4 years is: " + Math.round(total*100.00)/100.00);
	}
}