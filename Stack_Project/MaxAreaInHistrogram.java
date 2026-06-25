package Stack_Project;

import java.util.Stack;

public class MaxAreaInHistrogram {

    public static int MaxAreaHistro(int[] heights)
    {
        Stack<Integer> stack=new Stack<>();
        int maxArea=Integer.MIN_VALUE;
        int n=heights.length;

        for(int i=0;i<n;i++)
        {
             int element=(i==n) ? 0 : heights[i];

             while(!stack.isEmpty() && heights[stack.peek()] > element)
             {
                int h=heights[stack.pop()];
                int w;
                if(stack.isEmpty())
                {
                    w=i;
                }
                else
                {
                    w=i-stack.peek()-1;
                }
                maxArea=Math.max(maxArea,h*w);
             }
             stack.push(i);
        }


        return maxArea;

    }
     public static void main(String[] args)
     {
        int[] heights={2,1,5,6,2,3};
        System.out.println(MaxAreaHistro(heights));
        
     }
    
}
