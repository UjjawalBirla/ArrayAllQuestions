package INTERVIEW_QUESTION.DSA_2;

import java.util.Stack;

public class largest_histrogram_Area {
    
    public static void main(String[] args)
    {
        int[] h={2,1,5,6,2,3};
        int n=h.length;

        Stack<Integer> stack =new Stack<>();
        int maxArea=0;

        for(int i=0;i<=n;i++)
        {
            int element=(i==n) ? 0 : h[i];

            while(!stack.isEmpty() && h[stack.peek()] > element)
             {
                int currentHeight=h[stack.pop()];
                int width;
                if(stack.isEmpty())
                {
                    width=i;
                }
                else
                {
                    width=i-stack.peek()-1;
                }
                maxArea=Math.max(maxArea,currentHeight*width);
             }
             stack.push(i);
        }
        System.out.println("Max Area of h  =  " + maxArea);
     }
}

