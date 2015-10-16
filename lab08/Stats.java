//Importing the class Scanner so the program can get input from the user.
import java.util.Scanner;

//Declaring the class Stats
public class Stats{
    
    //Method that will print out the results. It receives a String, S, and a double, x, and print them in the order S+x.
    public static void Print(String S, double x){
        System.out.println(S+x);
    }
    
    //Method that will evaluate the mean of the 5 numbers. It receives 5 numbers and average them. Then, the average is returned.
    public static double Mean(double n1,double n2,double n3,double n4,double n5){
        double mean = (n1+n2+n3+n4+n5)/5.0;
        return mean;
    }
    
    //Method that will evaluate the median of the 5 numbers. Because it's an odd set of numbers, the median is going to be the number in the middle of it.
    // in this case, it's going to be the 3rd one.
    public static double Median(double n1,double n2,double n3,double n4,double n5){
        return n3;
    }
    
    //Declaring the Main Method.
    public static void main(String[] args){
        
        //Creating a Scanner object, so the program can get inputs from the user.
         Scanner myScanner = new Scanner(System.in);
         
        //This variable will be used to check if the value entered is greater than the previous one.
        boolean status=true;
        
        //These variables will be used to hold the values entered by the user.
        double n1=0, n2=0, n3=0, n4=0, n5=0;
        
        System.out.println("Enter a set of numbers in the increasing order: ");
        
        //The next lines are going to promp the user to enter 5 numbers and then, the program is going to store them
        // in the double variables n1, n2, n3, n4, n5.
        //If the number is not greater than the previous one, the user will be prompted to enter the number again.
        System.out.print("Enter the 1st number: ");
        n1=myScanner.nextDouble();
            
           
        System.out.print("Enter the 2nd number: ");
        while(status){
            n2=myScanner.nextDouble();
            if(n2>=n1){
                status=false;
            }
            else{
                status=true;
                System.out.print("Enter the number again. It should be greater than the previous one: ");
            }
        }
        status=true;
        
        System.out.print("Enter the 3rd number: ");
        while(status){
            n3=myScanner.nextDouble();
            if(n3>=n2){
                status=false;
            }
            else{
                status=true;
                System.out.print("Enter the number again. It should be greater than the previous one: ");
            }
        }
        status=true;
        
        System.out.print("Enter the 4th number: ");
        while(status){
           n4=myScanner.nextDouble();
            if(n4>=n3){
                status=false;
            }
            else{
                status=true;
                System.out.print("Enter the number again. It should be greater than the previous one: ");
            }
        }
        status=true;
        System.out.print("Enter the 5th number: ");
        while(status){
            n5=myScanner.nextDouble();
            if(n5>=n4){
                status=false;
            }
            else{
                status=true;
                System.out.print("Enter the number again. It should be greater than the previous one: ");
            }
        }
        
        //Using the method created above to print out the results.
        System.out.println("The set is: " + n1+" "+n2+" "+n3+" "+n4+" "+n5);
        Print("The mean is: ", Mean(n1,n2,n3,n4,n5));
        Print("The median is: ", Median(n1,n2,n3,n4,n5));
         
    }
}