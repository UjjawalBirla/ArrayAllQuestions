package Arrayproject;
public class firstrepeatingelementbruteforce {
    public static void main(String[] args) {
        
        int [] arr={1,2,3,4,4,5,2,3};
        int mindecidx=arr.length;
        int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                   mindecidx=j;
                   ans=arr[i];
                   
                }
            }
        }
        System.out.println(ans);

         // TC==> O(n2);
        // SC==> O(n);
    }
}
