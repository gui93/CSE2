//Student: Guilherme Junqueira Perticarari
//CSE2 - Lab 10
//Description: The user must enter the name of a random number of students (from 5 to 10). 
//              andom grades (from 0 to 100) will be generated for each one and, in the end,
//              the name and grade of each student will be printed out.

//Scanner will be used to get the barcode input from the user.
import  java.util.Scanner;

//Declaring the class array
public class array{
    //Declaring the main method.
    public static void main(String args[]){
        
        // 1.INPUT VARIABLES
        
        //'ran' will hold a random number from 5 to 10.
        int ran=(int)(5*Math.random())+5;
        
        //'s' will be an array of Strings. It will hold the name of each student.
        String[] s=new String[ran];
        
        //'midterm' will be an array of ints. It will hold the grade for each student.
        int[] midterm=new int[ran];
        
        //The scanner object will be used to get the input from the user.
        Scanner myScanner=new Scanner(System.in);
        
        // 2.GETTING THE INPUTS FROM THE USER
        
        //Promptin the user to enter the name of each student.
        //Inside the for-loop, each name will be assigned to each
        //position of the array 's'.
        System.out.println("Enter "+ran+" student names: ");
        for(int i=0;i<ran;i++){
            s[i]=myScanner.nextLine();
        }
        
        // 3.GENERATING A RANDOM NUMBER AND PRINTING OUT THE RESULTS
        
        //Inside the for-loop, a random number from 0 to 100 will be generated 
        //for each position of the array 'midterm'.
        //The program will print out the name and grade of each student.
        System.out.println("All set! Let's see how they're doing: ");
        for(int i=0;i<ran;i++){
            midterm[i]=(int)(Math.random()*100);
            System.out.println(s[i]+":"+midterm[i]);
        }
        
    }
}