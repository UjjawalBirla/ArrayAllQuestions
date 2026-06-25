package Arrayproject;
public class secondmaxbruteforce {
    
    public static void main(String[] args) {
        
        int[] arr={10,30,20,4,7,50};
        int n=arr.length;
                                                                                     // TC==> O(n log n);
                                                                                     // SC==> O(1);
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
           while(j>=0 && arr[j] > key)
           {
                arr[j+1]=arr[j];
                j--;
           }
            arr[j+1]=key;
        }
       
         System.out.print(arr[n-2]+" ");
        
         // for(int i=0;i<n;i++)
         // {
         //     System.out.print(arr[n-1]+" ");
         // }

        // int secondmax=Integer.MAX_VALUE;

        // for(int i=0;i<n;i++)
        // {
        //     int count=0;
        //     for(int j=0;j<n;j++)
        //     {
        //         if(arr[j]>arr[i])
        //          {
        //             count++;
        //          }

        //     }
        //     if(count==1)
        //     {
        //         secondmax=arr[i];
        //         break;
        //     }
            
        // }
        // System.out.println(secondmax);


    }
}
