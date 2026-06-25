package Arrayproject;

import java.util.*;

public class ArrayToAccDec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Size=sc.nextInt();
        int[] numbers=new int[Size];
        System.out.println("Array Input :");
        for(int i=0;i<Size;i++)  {
            numbers[i]=sc.nextInt();
        }
        System.out.println("Array Output :");
        for(int i=0;i<Size;i++)  {
            System.out.println(numbers[i]);
        }
        boolean isAccending=true;
        for(int i=0;i<numbers.length-1;i++) {
            if(numbers[i]>numbers[i+1])  {
                isAccending=false;        
            }
        }
            if(isAccending)   {
               
              System.out.println("Array is in Accending Number : ");        
            }
            else{
                System.out.println("Array is in Not Accending Number : ");
            }        
    }
}

