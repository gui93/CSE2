

import  java.util.Scanner;

public class Search{
    
    public static void binSearch(int[] s, int a){
        int n, upper=5000, low=0;
        while(a>s[low] && a<s[upper]){
            n=(int)(0.5*(upper+low));
            System.out.print(n);
            if(s[n]==a){
                System.out.print("The number was found! It's in position " + n);
            }
            else if(a>s[n]){
                low=n;
            }
            else if(a<s[n]){
                upper=n;
            }
            else if(s[low]==s[upper-1]){
                System.out.println("The number was not found! The lower bound is " + low + " and the upper bound is " + upper);
            }
            
        }
    }
    
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        int[] array1=new int[5000];
        int[] array2=new int[5000];
        int rand,max,min;
        for(int i=0;i<5000;i++){
            rand=(int)(100000*Math.random());
            array1[i]=rand;
        }
        max=array1[0];
        min=array1[0];
        for(int i=1;i<5000;i++){
            if(array1[i]>max){
                    max=array1[i];
            }
            else if(array1[i]<min){
                    min=array1[i];
            }
                
        }
        System.out.println("For array1:");
        System.out.println("The maximum is: " + max + " the minimum is: " + min);
        array2[0]=(int)(Math.random()*100000);
        for(int i=1;i<5000;i++){
            rand=(int)(100000*Math.random());
            while(rand<array2[i-1]){
                rand=(int)(100000*Math.random());
            }
            array2[i]=rand;
        }
        System.out.println("For array2:");
        System.out.println("The maximum is: " + array2[1] + " the minimum is: " + array2[0]);
        System.out.println("Type an integer greater than 0.");
        int input=myScanner.nextInt();
        if(input>0){
            binSearch(array2,input);
        }
        
    }
}