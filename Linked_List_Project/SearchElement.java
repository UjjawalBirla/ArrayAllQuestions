class Node{
    int data;
    Node next;
    Node(int data){

        this.data=data;
        this.next=next;
    }
}
public class SearchElement {
    public static String searchElement(Node head,int target)
    {
        while(head!=null)
        {
            if(head.data==target)
            {
                return "Yes";
            }
            head=head.next;
        }
        return "No";
    }
    public static void printList(Node head)
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
         Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next=new Node(5);

        // System.out.println("Before: ");
        // printList(head);

        searchElement(head, 3);

        // System.out.println("After: ");
        // printList(head);

        System.out.println(searchElement(head, 3));

    }
    
}
