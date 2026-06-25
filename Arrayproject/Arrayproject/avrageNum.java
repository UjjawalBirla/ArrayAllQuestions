package Arrayproject;
import java.util.Scanner;

public class avrageNum {

    public static float avrageNumber(float a,float b,float c)
    {
        Float avrage=a+b+c/3;
       
        return avrage;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Float a=sc.nextFloat();
         Float b=sc.nextFloat();
          Float c=sc.nextFloat();

          float avrage=avrageNumber(a,b,c);
            System.out.println(avrage);

    }
}
