package Arrayproject;
public class higestfreqbruteforce {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,1,2,2,2,3,1,4,5};
        int maxfre=0;
        int ans=-1;

        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>maxfre)
            {
                maxfre=count;
                ans=arr[i];
            }
        }
        System.out.println(ans+"->"+maxfre);

         // TC==> O(n2);
        // SC==> O(1);
    }
}
