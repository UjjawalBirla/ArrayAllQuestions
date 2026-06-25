package Queue_Project; 

public class QueueScratch {
    int [] arr;
    int front;
    int rear;
    int size;

    public QueueScratch(int size)
    {
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
    }

    void Enqueue(int data)
    {
        if(rear==size-1)
        {
            System.out.println("Queue OverFlow");
            return;
        }
        if(front==-1)
            front=0;

        rear++;
        arr[rear]=data;
        System.out.println(data +"inserted");
    }

    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue Underfow");
            return;
        }
        System.out.println(arr[front]+ "removed");
        front++;

        if(front>rear)
        {
            front=rear=-1;
        }
    }
    

    private boolean isEmpty() {
       return front==-1;
    }

    void peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("peek element = "+arr[front]);
    }

    public static void main(String[] args) {

        QueueScratch q=new QueueScratch(5);
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);

        q.peek();
        q.dequeue();
        q.peek();

        q.dequeue();
        q.dequeue();

        System.out.println("is Empty : " + q.isEmpty());
    }
    
}
