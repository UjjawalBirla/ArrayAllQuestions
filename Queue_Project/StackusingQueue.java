package Queue_Project;

import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueue {

    Queue<Integer> queue;
    public StackusingQueue()
    {
        queue = new LinkedList<>();
    }

    public void push(int x)
    {
        int size=queue.size();
        queue.add(x);
        while(size --> 0)
        {
            queue.add(queue.poll());
        }
    }

    public int pop()
    {
        return queue.poll();
    }
    
    public int peek()
    {
        return queue.peek();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public static void main(String[] args) {

        StackusingQueue q=new StackusingQueue();

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
