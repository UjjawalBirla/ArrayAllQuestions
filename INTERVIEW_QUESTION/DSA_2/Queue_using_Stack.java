package INTERVIEW_QUESTION.DSA_2;

import java.util.Stack;

public class Queue_using_Stack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Queue_using_Stack()
    {
        stack1=new Stack<>();
        stack2=new Stack<>();

    }

    public void push(int data)
    {
         stack1.push(data);
    }

    public int pop()
    {
        peek();
        return stack2.pop(); 
    }

    public int peek()
    {
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean Empty()
    {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        
        Queue_using_Stack q=new Queue_using_Stack();

        q.push(10);
        q.push(20);

        System.out.println("POP : " + q.pop());

        q.push(30);
        q.push(40);

        System.out.println("Peek : " + q.peek());

        System.out.println("POP : " + q.pop());
        System.out.println("POP : " + q.pop());
        System.out.println("POP : " + q.pop());
       
    }

    
}
