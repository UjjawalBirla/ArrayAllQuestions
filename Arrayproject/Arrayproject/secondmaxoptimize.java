package Arrayproject;
public class secondmaxoptimize {
    
    public static void main(String[] args) {

        
        int[] arr={10,3,5,6,78,9};

        if(arr.length<2)
        {

            System.out.println(-1);
            return;

        }
        int max=Integer.MIN_VALUE;

        int secondmax=Integer.MIN_VALUE;
        
        // if(arr[0]>arr[1])
        // {
        //     max=arr[0];
        //     secondmax=arr[1];

        // }
        // else{
        //     max=arr[1];
        //     secondmax=arr[0];
        // }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max)
            {
                secondmax=arr[i];
            }
        }

        if(secondmax== Integer.MAX_VALUE)
        {
            System.out.println(-1);
        }
        else
            {
                System.out.println(secondmax);
            }


             // TC==> O(n);
             // SC==> O(1);
    }
}
