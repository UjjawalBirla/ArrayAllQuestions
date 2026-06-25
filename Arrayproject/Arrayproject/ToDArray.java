package Arrayproject;
import java.util.Scanner;

public class ToDArray {
    public static void main(String[] args) { 
        System.out.println("Enter the Array Aize :");      
        Scanner sc =new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] numbers=new int[rows][cols];
        System.out.println("Enter the Array Element :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }   
        System.out.println("Array OutPut :");    
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               System.out.print(numbers[i][j]+" "); 
            }
            System.out.println();
        } 
        System.out.println("Enter the Array to find index :");  
        int x=sc.nextInt();  
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
          if(numbers[i][j]==x){
            System.out.println("X Element is Found : ("+i+","+j+")");
          }
        }  
    }
}
    

