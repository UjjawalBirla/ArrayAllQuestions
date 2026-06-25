package Queue_Project;

public class CircularQueue {
    
    int [] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public CircularQueue(int k)
    {
        capacity =k;
        arr=new int [k];
        front=0;
        rear=-1;
        size=0;
    }

    public boolean EnQueue(int value)
    {
        if(isFull()) return false;

        rear=(rear+1) % capacity;
        arr[rear] =value;
        size++;
        return true;
    }

    public boolean deQueue()
    {
        if(isEmpty()) return false;

        front=(front+1) % capacity;
        
        size--;
        return true;
    }

    public int front()
    {
        if(isEmpty()) return -1;

        return arr[front];
    }
    public int rear()
    {
        if(isEmpty()) return -1;

        return arr[rear];
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public boolean isFull()
    {
        return size==capacity;
    }
   

    public static void main(String[] arg) {
        CircularQueue q=new CircularQueue(3);
        System.out.println(q.EnQueue(1));
        System.out.println(q.EnQueue(2));
        System.out.println(q.EnQueue(3));
        System.out.println(q.EnQueue(4));
       

        System.out.println("Rear : " + q.rear());
        System.out.println("Is full : " + q.isFull());
        System.out.println(q.deQueue());
        System.out.println(q.EnQueue(4));
        System.out.println("Rear : " + q.rear());
        System.out.println("Front : " + q.front());
       
    }
}
// MyCircularQueue myCircularQueue = new MyCircularQueue(3);
// myCircularQueue.enQueue(1); // return True
// myCircularQueue.enQueue(2); // return True
// myCircularQueue.enQueue(3); // return True
// myCircularQueue.enQueue(4); // return False
// myCircularQueue.Rear();     // return 3
// myCircularQueue.isFull();   // return True
// myCircularQueue.deQueue();  // return True
// myCircularQueue.enQueue(4); // return True
// myCircularQueue.Rear();     // return 4
