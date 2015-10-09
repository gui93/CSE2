//Student: Guilherme Junqueira Perticarari
//Lehigh ID: 824858244
//Course: CSE-002
//Date: 10/2/2015
//Lab 6: Getting Loopy

public class GettingLoopy{
    public static void main(String[] args){
        
        //STEP1
        
        System.out.println("STEP 1:");
        int i=1;
        int n=5;
        while(i<7){
                System.out.print(i);
                i=i+1;
            }
          while(n>0){
                    System.out.print(i);
                    n=n-1;
            }
        
        System.out.println("");
        //STEP 2
        
        System.out.println("STEP 2:");
        
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
        
        //STEP 3
        System.out.println(" ");
        
        int j =(int)(Math.random()*195)+5;
        int counter=1;
        while(j>0){
            System.out.print("ツ");
            counter++;
            if(counter==20){
                System.out.println("");
                counter=1;
            }
            
            j--;
        }
        
    }
}
