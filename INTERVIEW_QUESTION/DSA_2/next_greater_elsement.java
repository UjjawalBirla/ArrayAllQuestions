package INTERVIEW_QUESTION.DSA_2;

import java.util.Stack;

public class next_greater_elsement {
    
   public static void main(String[] args)
   {
     int[] arr= {2,5,2,10};
     int n=arr.length;
     Stack<Integer> stack =new Stack<>();

     int[] res=new int[n];

     for(int i=n-1;i>=0;i--)                                                        //TC = O(n)
     {                                                                              //SC = O(n)
        while(!stack.isEmpty() && stack.peek()<=arr[i])
        {
            stack.pop();
        }
            res[i]=stack.isEmpty()? -1 : stack.peek();
            stack.push(arr[i]);
     }

     for(int x:res)
     {
        System.out.print(x+" ");
     }
   }
}
