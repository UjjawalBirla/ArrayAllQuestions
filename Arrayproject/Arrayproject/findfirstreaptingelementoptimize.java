package Arrayproject;
import java.util.HashSet;

public class findfirstreaptingelementoptimize {
    
    public static void main(String[] args) {
         int [] arr={1,2,3,4,4,5,2,3};

         HashSet<Integer> set=new HashSet<>();

         for(int x:arr)
         {
            if(set.contains(x))
            {
                System.out.println(x);
                break;
            }
             set.add(x);
         }


          // TC==> O(n);
        // SC==> O(n);
        
    }
}
