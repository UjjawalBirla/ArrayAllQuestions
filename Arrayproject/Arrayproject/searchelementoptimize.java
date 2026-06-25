package Arrayproject;
public class searchelementoptimize {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6,7,8,9,0};

        int target=6;

        int l=0;
        int h=arr.length-1;
        while(l<=h)
        {
            int  mid=l+(h-l)/2;

            if(arr[mid]==target)
            {
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }

         // TC==> O(log n);
        // SC==> O(1);
    }

}
