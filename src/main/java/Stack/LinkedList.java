package Stack;

public class LinkedList {
    Node head;
    Node tail;

    public Node push(int data) {
        Node node = new Node(data);
        if (head == null) {
            this.head = node;
        } else {
            tail.next = node;
        }
        this.tail = node;
        return node;
    }

    public void printList() {
        Node node = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (node != null) {
                if (node.next != null) {
                    System.out.print(node.data + " -> ");
                } else
                    System.out.println(node.data);
                node = node.next;
            }
        }
    }

}
