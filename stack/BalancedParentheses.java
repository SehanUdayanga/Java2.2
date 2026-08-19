import java.util.Scanner;


// Node class
class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}


// Stack ADT using Linked List
class StackLinkedListADT<T> {

    Node<T> top;

    // Constructor
    public StackLinkedListADT() {
        top = null;
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push
    public void push(T data) {

        Node<T> newNode = new Node<>(data);

        newNode.next = top;
        top = newNode;
    }

    // Pop
    public T pop() {

        if (isEmpty()) {
            return null;
        }

        T data = top.data;
        top = top.next;

        return data;
    }

    // Peek
    public T peek() {

        if (isEmpty()) {
            return null;
        }

        return top.data;
    }
}


// Main class
public class BalancedParentheses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String expression = sc.nextLine();

        StackLinkedListADT<Character> stack =
                new StackLinkedListADT<>();

        boolean balanced = true;

        // Check each character
        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            // Opening parenthesis
            if (ch == '(') {
                stack.push(ch);
            }

            // Closing parenthesis
            else if (ch == ')') {

                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                stack.pop();
            }
        }

        // If stack is not empty, there are unmatched '('
        if (!stack.isEmpty()) {
            balanced = false;
        }

        // Result
        if (balanced) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}