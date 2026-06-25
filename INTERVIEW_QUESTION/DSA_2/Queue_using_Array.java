package INTERVIEW_QUESTION.DSA_2;

public class Queue_using_Array {

    int arr[];
    int front;
    int rear;
    int size;
    int capacity;
    
    Queue_using_Array(int capacity)
    {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue Overflow ");
            return;
        }
        
        rear=(rear+1)%capacity;
        arr[rear]=data;
        size++;
         System.out.println(data + " inserted into queue");
    }

    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed=arr[front];
        front=(front +1) % capacity;
        size--;   
        
        return removed;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isFull()
    {
        return size==capacity;
    }

    public boolean isEmpty()
    {
        return size==0;
        
    }
    
    public void display() 
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue Elements: ");

        for (int i = 0; i < size; i++) 
        {
            System.out.print(arr[(front + i) % capacity] + " ");
        }

        System.out.println();
    }
    
    public static void main(String[] args) {

        Queue_using_Array q=new Queue_using_Array(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Deleten Element : " + q.dequeue());

        System.out.println("Peek Element : " + q.peek());

        q.display();

        q.enqueue(40);
        q.enqueue(50);

        q.display();
        
        
    }
    
}
