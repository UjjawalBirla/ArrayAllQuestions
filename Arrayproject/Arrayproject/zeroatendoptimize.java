package Arrayproject;
public class zeroatendoptimize {
    
    public static void main(String[] args) {
        
        int[] arr={1,0,2,0,3,4,5};
        
        int n=arr.length-1;

        int zero=0;
        for(int i=0; i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[zero];
                arr[zero]=temp;
                zero++;
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }

         // TC==> O(n);
        // SC==> O(1);
    }
}
