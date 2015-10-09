//Student: Guilherme Junqueira Perticarari
//Lehigh ID: 824858244
//Course: CSE-002
//Date: 10/2/2015
//Lab 6: Getting Loopy

public class GettingLoopy{
    public static void main(String[] args){
        
        //STEP1
        
        //'STEP 1: ' is printed out.
        System.out.println("STEP 1:");
        
        //'i' is gonna be iterated for the first while loop.
        int i=1;
        
        //'n' is gonna be iterated for the second loop.
        int n=5;
        
        //This while-loop is gonna print out the integers from i to 7.
        while(i<7){
                System.out.print(i);
                i=i+1;
        }
        
        //This while-loop is gonna print out the integer 7 (current value of i) 5 times in a row.
         while(n>0){
                System.out.print(i);
                n=n-1;
        }
        
        //Printing out a line for the next step.
        System.out.println();
        //STEP 2
        
        //Printing out 'STEP 2:'
        System.out.println("STEP 2:");
        
        //Printing out the while-loop.
        //factor is gonna iterate from 2 to num and num mod factor is gonna be evaluated.
        //If the result is 0, count is gonna be incremented, otherwise, nothing happens.
        //If by the end of the while loop, count is still 0, the number is a prime and should be printed.
        //The next for and do-while loops are built under the same reasoning.
        System.out.print("While Loop: ");
        int num=10;
        int factor=2;
        int count=0;
        while(num<100){
            count=0;
            while(factor<num){
                if(num%factor==0){
                    count++;
                }
                else{
                    
                }
                factor++;
            }
            factor=2;
            if(count==0){
            System.out.print(num+" ");
            }
            num++;
        }
        System.out.println("");
        System.out.print("For: ");
        for(num=10;num<100;num++){
            count=0;
            while(factor<num){
                if(num%factor==0){
                    count++;
                }
                else{
                    
                }
                factor++;
            }
            factor=2;
            if(count==0){
            System.out.print(num+" ");
            }
        }
        
        System.out.println("");
        System.out.print("Do-While: ");
        num=10;
        factor=2;
         do{
            count=0;
            while(factor<num){
                if(num%factor==0){
                    count++;
                }
                else{
                    
                }
                factor++;
            }
            factor=2;
            if(count==0){
                System.out.print(num+" ");
            }
            num++;
        } while(num<100);
        
        
        //STEP 3
        System.out.println("");
        
        //Generating a random number from 5 to 200.
        int j =(int)(Math.random()*195)+5;
        
        //This variable is gonna count the number of characters in each line.
        int counter=1;
        
        //This while-loop is gonna iterate from the number generated until it reaches 0.
        while(j>0){
            System.out.print("ツ");
            counter++;
            
            //If counter==20, that means that the maximum quota of characters per line has been printed out.
            //so, the programs goes to the next line and counter receives the value 1 so it can count properly the
            //number of characters in the next line.
            if(counter==20){
                System.out.println("");
                counter=1;
            }
            
            j--;
        }
        
    }
}
