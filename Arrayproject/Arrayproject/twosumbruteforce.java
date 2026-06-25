package Arrayproject;
public class twosumbruteforce {
    
    public static int[] twoSum(int[] arr,int target,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                   return new int[]{arr[i],arr[j]};
                }
               
            }
           
        }
         return new int[]{-1,-1};
    }
    
    public static void main(String[] args) {
        int[] arr={1,5,3,4,5};
        int target=10;
        int n= arr.length;
        int[] result=twoSum(arr,target,n);
        System.out.println(result[0]+" "+result[1]);

    }
}
