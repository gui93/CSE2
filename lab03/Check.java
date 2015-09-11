//Student: Guilherme Junqueira Perticarari
//Lehigh ID: 824858244
//Course: CSE-002
//Date: 9/11/2015
//Lab 3 : Check 
//Description: In this program, we are going to get the following inputs from the user:
//              a.Cost of the check
//              b.Value of the tip to be payed
//              c.Number of people having dinner
//            With these inputs, the software must calculate the amount that each person
//            having dinner must pay, if the check is devided evenly.

//I'll have to use the Scanner class to get inputs from the user, so I must
//import it to my program.
import java.util.Scanner;

//Declaring the Check class.
public class Check{
    //Declaring the main method.
    public static void main(String[] args){
        
        //Declaration of the instance of the Scanner object
        Scanner myScanner = new Scanner( System.in );
        
        // 1.GETTING INPUTS FROM THE USER:
        //Printing out the message for the user to type the cost of the check.
        System.out.print("Type the original cost of the check (in the form xx.xx) : ");
        //The variable checkCost is going to hold the value typed for the check cost.
        double checkCost = myScanner.nextDouble();

        //Printing out the message for the user to type the value of the tip as a whole number.
        System.out.print("Type the value for the tip you wish to pay (as a whole number xx):" );
        //The variable tipPercent is going to hold the value typed for the tip.
        double tipPercent = myScanner.nextDouble();
        //The value for the tip is going to be converted to a decimal value.
        tipPercent=tipPercent/100;
        
        //Printing out the message for the user to type the number of people having dinner.
        System.out.print("Enter the number of people who went out to dinner: ");
        //The variable numPeople is gonna store the value typed for the number of people.
        int numPeople = myScanner.nextInt();
        
        // 2. CALCULATING THE OUTPUTS:
        //The variable totalCost is going to hold the value of the check cost plus taxes.
        double totalCost;
        //The variable is going to hold the total cost per person.
        double costPerPerson;
        //These variables are going to hold the cost per person in dollars, dimes and pennies
        int dollars, dimes, pennies; 
        
        //Basic arithmetic computation to find out what the total cost plus taxes is.
        totalCost = checkCost * (1 + tipPercent);
        //The cost per person is going to be the total cost devided by the number of people
        costPerPerson = totalCost / numPeople;
        //The integer of the cost is going to be assigned to variable dollars.
        dollars=(int)costPerPerson;
        //The first digit right after the decimal point is going to be stored in the variable dimes.
        dimes=(int)(costPerPerson * 10) % 10;
        //The second digit after the decimal point is going to be stored in the variable pennies.
        pennies=(int)(costPerPerson * 100) % 10;
        
        // 3.PRINTING OUT THE RESULTS
        //Printing out the results in the format xx.xx. For example, $12.49.
        System.out.println("Each person in the group must pay $" + dollars + '.' + dimes + pennies);
    } // End of the main method
} // End of the Check class