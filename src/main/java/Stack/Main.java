package Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Push ");
        System.out.println("Enter 2 for Peek ");
        System.out.println("Enter 3 for Pop Element...");
        switch (sc.nextInt())
        {
            case 1:
                stack.push();
                break;
            case 2:
                stack.peek();
                break;
            case 3:
                stack.pop();
            default:
                System.out.println("Please enter correct option");
        }
    }
}
