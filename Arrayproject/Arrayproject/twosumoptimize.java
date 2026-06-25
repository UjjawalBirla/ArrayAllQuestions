package Arrayproject;
import java.util.*;
public class twosumoptimize {
     public static int[] twoSum(int[] arr,int target,int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int complement=target - arr[i];
            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};

    }
    
    public static void main(String[] args) {
        int[] arr={1,5,3,4,6};
        int target=9;
        int n= arr.length;
        int[] result=twoSum(arr,target,n);
        System.out.println(result[0]+" "+result[1]);

    }
}
