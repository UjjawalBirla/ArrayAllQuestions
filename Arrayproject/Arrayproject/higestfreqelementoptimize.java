package Arrayproject;
import java.util.HashMap;

public class higestfreqelementoptimize {
    public static void main(String[] args) {
      int[] arr={1,2,3,1,2,2,2,3,1,4,5};
       
      HashMap<Integer,Integer> map=new HashMap<>();

      for(int x:arr)
      {
        map.put(x,map.getOrDefault(x, 0) +1);
      }
      int maxfreq=0;
      int ans=-1;
      for(int key:map.keySet())
      {
        if(map.get(key)>maxfreq)
        {
            maxfreq=map.get(key);
            ans=key;
        }
      }
      System.out.println(ans+"->"+maxfreq);

       // TC==> O(n);
        // SC==> O(n);

    }
}
