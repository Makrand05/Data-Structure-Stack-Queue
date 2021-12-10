package Stack;

public class Stack {
    public Node top;
    LinkedList linkedList;


    public Stack() {
        this.linkedList = new LinkedList();
    }

    public void push() {
        linkedList.push(70);
        linkedList.push(30);
        top = linkedList.push(56);
        linkedList.printList();
        System.out.println("Top - > " + top.data);
    }

    public void peek() {
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        top=linkedList.peek();
        System.out.println("Top - > " + top.data);
    }

    public void pop() {
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        top=linkedList.pop();
        System.out.println("Top - > " + top.data);
        System.out.println("After ------ ");
        linkedList.printList();
    }
}
