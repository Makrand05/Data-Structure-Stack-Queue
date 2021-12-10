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

    public Node peek() {
        Node node = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (node.next != null) {
                node = node.next;
            }
        }
        return node;
    }

    public Node pop() {
        Node node = this.head;
        while (node.next != null) {
            System.out.println("Popped Element : "+node.next.next.data);
            node = node.next;
            node.next = null;

        }

        return node;

    }
}
