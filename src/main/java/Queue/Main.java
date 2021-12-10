package Queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Push Queue");
        System.out.println("Enter 2 for pop from Queue");
        switch (sc.nextInt()) {
            case 1:
                queue.create();
                break;
            case 2:
                queue.dequeue();
            default:
                System.out.println("Please enter correct option");
        }
    }
}
