class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=next;
    }
}
public class InsertAtMiddle {

    public static Node insertAtMiddle(Node head,int k,int pos)
    {
        Node dummy=new Node(k);
        if(pos==1)
        {
            dummy.next=head;
            return dummy;
        }

        Node temp=head;

        for(int i=1;i<pos-1;i++)
        {
            if(temp==null)
            {
                System.out.println("Pasition out of Bound");
                return head;
            }
            temp=temp.next;
        }

        dummy.next=temp.next;
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
        head.next.next=new Node(40);
        head.next.next.next=new Node(50);
       
         System.out.println("Before: ");
        printList(head);

        head = insertAtMiddle(head,30,3);

        System.out.println("After: ");
        printList(head);

    }
}


