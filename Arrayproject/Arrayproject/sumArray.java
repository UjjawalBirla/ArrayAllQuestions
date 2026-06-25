package Arrayproject;
public class sumArray {
    public static int method(int arry[])
{
   
     int sum=0;
       for(int i=0;i<=arry.length-1;i++)
        {
              sum=sum+arry[i]; 
             
        }
    return sum;
       
}
    public static void main(String[] args)
    {
       int arry[]={2,4,6};
        System.out.println("array ="+method(arry));
    }
}
