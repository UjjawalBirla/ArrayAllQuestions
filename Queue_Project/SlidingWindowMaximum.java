package Queue_Project;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k)
    {
        int n=nums.length;
        int[] ans=new int[n-k+1];

        Deque<Integer> dq=new ArrayDeque<>();

        int index=0;

        for(int i=0;i<n;i++)
        {
            if(!dq.isEmpty() && dq.peekFirst()<i-k)
            {
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <nums[i])
            {
                dq.pollLast();
            }
            dq.offer(i);

            if(i>=k-1)
            {
                ans[index++]=nums[dq.peek()];
            }
        }

        return ans;
    }
    

    public static void main(String[] args) {
        
        SlidingWindowMaximum obj=new SlidingWindowMaximum();

        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] result=obj.maxSlidingWindow(nums, k);

        for(int x:result)
        {
            System.out.println(x+" ");
        }
    }
}
