package Arrayproject;
import java.util.Scanner;

public class Fabbonicseries {

    public static void fabbonicseries(int n)
    {
        int lastnum=0;
        int previous=1;
        System.out.println("Fibonacci Series: "+n);
        for(int i=1;i<=n;i++)
        {
            System.out.println(lastnum+" ");
            int sum=lastnum+previous;
            lastnum=previous;
            previous=sum;
           
        }
        System.out.println();
         
    }
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        fabbonicseries(n);
    
    }
}
