//Student: Guilherme Junqueira Perticarari
//Lehigh ID: 824858244
//Course: CSE-002
//Date: 10/2/2015
//Lab 7: encrypted_X
//Description: The user must enter the size of the square, N, and, with it,
//              the software must print out a NxN square of '*' characters
//              with an X written with space characters.

//Importing Scanner so we can get inputs from the user.
import java.util.Scanner;

public class encrypted_X{
    public static void main(String[] args){
        
        //Declaring a Scanner object to get input from the user.
        Scanner myScanner = new Scanner(System.in);
        
        //Asking the user to enter the size of the square.
        System.out.print("Tell me the size of the square: ");
        
        //'input' will store the value entered.
        int input=myScanner.nextInt();
        
        //These two variables will be useful so the program knows where to print spaces instead of '*' characters.
        int count1=0,count2=input-1;
        
        //The reasoning behind these for-loops is:
        //  1-it's gonna iterate from 0 to input-1 lines (variable i), and for every line, it's gonna iterate from 0 to input-1 columns (variable j).
        //  2-'count1' will hold position where the first space should be printed out (for each line).
        //  3-'count2' will hold the position where the second space should be printed out (for each line).
        //  4-When printing out a line, if j is equal to count1 or count2, the if-statement is going to happen and the program is gonna
        //      print out a line. Otherwise, it will print out a '*'.
        //  5-After each line comes to an end, the software leaves the inner for-loop and goes to the next line.
        //  6-Before the next iteration begins, count1 is incremented and count2 is decremented, so the X can be properly printed out.
        for(int i=0;i<input;i++){
            for(int j=0;j<input;j++){
                if(j==count1 || j==count2){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            count1=count1+1;
            count2=count2-1;
        }
    }//end of main method.
}//end of the class declaration.