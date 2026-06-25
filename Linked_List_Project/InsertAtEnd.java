class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=next;
    }
}
public class InsertAtEnd {
    
    public static Node InsertAtend(Node head,int k)
    {
        Node dummy=new Node(k);
        if(head==null)
        {
            return dummy;
        }
        Node temp =head;
        while(temp.next!=null)
        {
           temp=temp.next;
        }
        temp.next=dummy;
        return head;

    }
    public static void printList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
       
         System.out.print("Before: ");
        printList(head);

        head = InsertAtend(head,50);

        System.out.print("After: ");
        printList(head);

    }
}
