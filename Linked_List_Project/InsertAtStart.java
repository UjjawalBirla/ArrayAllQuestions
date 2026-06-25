class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class InsertAtStart {
     public static Node insertAtBeginning(Node head, int k) {
        Node newNode = new Node(k);

        // Step 1: point new node to old head
        newNode.next = head;

        // Step 2: update head
        head = newNode;

        return head;
    }
     public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
          // Create list: 2 → 4 → 6 → 8
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);

        System.out.println("Before: ");
        printList(head);

        head = insertAtBeginning(head, 10);

        System.out.println("After: ");
        printList(head);
    
    }
}
