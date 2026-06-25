package Arrayproject;
public class reverseArraybruteforce {

    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int[] rev=new int[n];


        for(int i=n-1;i>=0;i--)
        {
            rev[i]=arr[i];
             System.out.print(rev[i]+" ");
        }

        // TC==> O(n);
        // SC==> O(n);
           
        
    }
    
}
