package INTERVIEW_QUESTION.DSA_2;

import java.util.Stack;

public class Min_Stack {
    Stack<Integer> stack;
    Stack<Integer> minstack;

    public Min_Stack()
    {
        stack=new Stack<>();
        minstack=new Stack<>();
    }

    public void push(int val)
    {
        stack.push(val);
         if(minstack.isEmpty() || val<=minstack.peek())
        {
            minstack.push(val);
        }
    }
    public  void pop()
    {
        if(stack.peek().equals(minstack.peek()))
        {
            minstack.pop();
        }
        stack.pop();
    }
    public  int peek()
    {
        return stack.peek();

    }
    
    public int minStack()
    {
        return minstack.peek();

    }

    public static void main(String[] args)
    {
     Min_Stack ms=new Min_Stack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        System.out.println(ms.minStack());
        ms.pop();
        System.out.println(ms.peek());
        System.out.println(ms.minStack());
    }

}   

