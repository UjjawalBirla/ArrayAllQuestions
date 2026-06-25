package Arrayproject;
import java.util.Scanner;

public class ArrayTosearch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] numbers=new int[size];
        
        System.out.println("Array Input :");
        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }
        System.out.println("Array Output :");
        for(int i=0;i<size;i++)
        {
            System.out.println(numbers[i]);
        }
        System.out.println("Enter To Find Array Index :");
        int x =sc.nextInt();
        for(int i=0;i<numbers.length;i++){

            if(numbers[i]==x)
            {
                System.out.println("Array of Index Is Found :"+i);
            }
        }
       
        
    }
    
}
