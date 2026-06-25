package Arrayproject;
public class zeroatendbruteforce {
    
    public static void main(String[] args) {
        
        int[] arr={1,0,2,0,3,4,5};
        
        int n=arr.length-1;

        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                for(int j=i;j<n-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                arr[n-1]=0;
            }

        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

         // TC==> O(n2);
        // SC==> O(1);
    }
}
