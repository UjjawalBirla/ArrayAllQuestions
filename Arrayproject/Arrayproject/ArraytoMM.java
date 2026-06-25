package Arrayproject;
import java.util.Scanner;

public class ArraytoMM {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] numbers=new int[size]; 
        System.out.println("Array Input :");
        for(int i=0;i<size;i++)  {
            numbers[i]=sc.nextInt();
        }
        System.out.println("Array Output :");
        for(int i=0;i<size;i++)  {
            System.out.println(numbers[i]);
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]<min)  {
                min=numbers[i];
            }
            if(numbers[i]>max)   {
                max=numbers[i];        
            }
        }
         System.out.println("Minimum Number is Found : "+min);
         System.out.println("Maximum Number is found : "+max);
    } 
}
