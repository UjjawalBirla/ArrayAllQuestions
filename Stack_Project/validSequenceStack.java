package Stackproject;

import java.util.Stack;

public class validSequenceStack {

    public static boolean validstack(int[] pushed,int[] popped)
    {
        Stack<Integer> stack=new Stack<>();

        int j=0;

        for(int x:pushed)
        {
            stack.push(x);

            while(!stack.isEmpty() && j<popped.length  && stack.peek()==popped[j])
            {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
        
    }


    public static void main(String[] args) {
        
        int[] pushed={1,2,3,4,5};
        int[] popped={4,5,3,2,1};
        System.out.println(validstack(pushed, popped));
    }
    
    
}
