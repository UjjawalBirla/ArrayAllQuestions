package Arrayproject;
 class Startringle {

    public static void main(String[] args)
    {
        

        for (int row = 10; row <=1; row++) 
        {       
            for (int col = 10; col >=1; col++)
            {       
                System.out.print("  ");
            }
            for(int space=1;space<=row;space++)
            {
            System.out.print("*   "); 
            }
           System.out.println();
        }
    }
}