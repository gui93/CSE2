

import  java.util.Scanner;

public class Search{
    
    public static void binSearch(int[] s, int a){
        int n=0, upper=5000, low=0;
        boolean e=true;
        while(upper>=low){
            n=(int)(0.5*(upper+low));
            if(s[n]==a){
                
                System.out.print("The number was found! It's in position " + n);
                break;
            }
            if(a>s[n]){
                low=n+1;
            }
            if(a<s[n]){
                upper=n-1;
            }
            if(upper-1==low+1){
                break;
            }
        }
        if(e){
            System.out.println("The number was not found");
            System.out.println("The number above the key: " + s[upper] + ". The number below the key: " + s[low]);
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
        System.out.println("The maximum is: " + array2[5000-1] + " the minimum is: " + array2[0]);
        System.out.print("Type an integer greater than 0: ");
        int input=myScanner.nextInt();
        if(input>0){
            binSearch(array2,input);
        }
        
    }
}