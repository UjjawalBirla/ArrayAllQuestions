package Arrayproject;
public class missingnumberbruteforce {
    
    public static void main(String[] args) {
        
        int [] arr={0,1,2,3,5};
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            boolean found=false;
            for(int x : arr)
            {
                if(x==i)
                {
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                System.out.println(i);
            }
        }



           // TC==> O(n2);
           // SC==> O(1);

    }
}
