

import  java.util.Scanner;

public class ArrayManipulation{
    
    public static int[][] raggedArray(){
        int[][] array;
        int rand1=(int)(Math.random()*10)+10;
        array=new int[rand1][];
        for(int i=0;i<rand1;i++){
            int rand2=(int)(Math.random()*10)+10;
            array[i]=new int[rand2];
        }
        for(int i=0;i<rand1;i++){
            for(int j=0;j<array[i].length;j++){
                int rand3=(int)(Math.random()*2000)-1000;
                array[i][j]=rand3;
            }
        }
        
        return array;
    }
    
    public static void printArray(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
    public static int findSmallest(int[][] array){
        int min=array[0][0];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(min>array[i][j]){
                    min=array[i][j];
                }
            }
        }
        return min;
    }
    public static int findLargest(int[][] array){
        int max=array[0][0];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(max<array[i][j]){
                    max=array[i][j];
                }
            }
        }
        return max;
    }
    public static int[] mostEven(int[][] array){
        int[] n=new int[array.length];
        for(int i=0;i<n.length;i++){
            n[i]=0;
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]%2==0){
                    n[i]=n[i]+1;
                }
            }
        }
        int max=n[0];
        for(int i=0;i<n.length;i++){
            if(max<n[i]){
                max=n[i];
            }
        }
        System.out.print("system: " + max);
        return array[max];
    }
    public static void main(String args[]){
        int[][] array;
        array=raggedArray();
        printArray(array);
        System.out.println("The smalles number is: " + findSmallest(array));
        System.out.println("The largest number is: " + findLargest(array));
        int[] most=mostEven(array);
        System.out.print("The array with the most even numbers is: ");
        for(int i=0;i<most.length;i++){
            System.out.print(most[i]);
        }
    
    }
    
}
    
    