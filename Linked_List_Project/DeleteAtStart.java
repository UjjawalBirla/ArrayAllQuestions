class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=next;
    }
}
public class DeleteAtStart {
    public static Node deleteAtEnd(Node head)
    {
        if(head==null)
        {
            System.out.println("not deleted at start");
            return head;
        }
       
        return head.next;
    }
    public static void printList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
         Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
       
         System.out.println("Before: ");
        printList(head);

        head = deleteAtEnd(head);

        System.out.println("After: ");
        printList(head);
    }
}
