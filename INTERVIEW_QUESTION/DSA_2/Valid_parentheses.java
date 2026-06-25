package INTERVIEW_QUESTION.DSA_2;

import java.util.Stack;

public class Valid_parentheses {
    public static void main(String[] args) {
        String s="{[()]}";

        Stack<Character> stack=new Stack<>();                                        // TC = O(n)
                                                                                     // SC = O(n)
        for(char c : s.toCharArray())
        {
            if(c== '(')
            {
                stack.push(')');
            }
            else if(c== '[')
            {
                stack.push(']');
            }
            else if(c=='{')
            {
                stack.push('}');
            }
            else if(stack.isEmpty() || stack.pop()!=c)
            {
               System.out.println("False");
               return;
            }
        }
       System.out.println("true");
        
    }
}
