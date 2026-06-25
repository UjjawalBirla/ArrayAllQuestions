package Queue_Project;

import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> stack1;
    Stack<Integer> stack2;


    public QueueUsingStacks()
    {
        stack1=new Stack<>();
        stack2=new Stack<>();

    }

    public void push(int x)
    {
        stack1.push(x);
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

    public boolean isEmpty()
    {
        return stack1.isEmpty() && stack2.isEmpty();
    }


    public static void main(String[] args) {

        QueueUsingStacks q=new QueueUsingStacks();

        q.push(1);
        q.push(2);
        q.push(3);
        
        System.out.println("Peek : "+q.peek());
        System.out.println("pop : "+q.pop());
        System.out.println("pop : "+q.pop());
        System.out.println("Empty : "+q.isEmpty() );
        System.out.println("pop : "+q.pop());
        System.out.println("Empty : "+q.isEmpty() );

    }
    
}
