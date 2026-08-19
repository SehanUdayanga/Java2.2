import java.util.Scanner;

// Stack ADT using Array
class Stack {

    int top;
    int maxSize;
    char arr[];

    // Constructor
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new char[maxSize];
        this.top = -1;
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check whether stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Push
    public void push(char data) {

        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = data;
        }
    }

    // Pop
    public char pop() {

        if (isEmpty()) {
            return '\0';
        } else {
            return arr[top--];
        }
    }

    // Peek
    public char peek() {

        if (isEmpty()) {
            return '\0';
        } else {
            return arr[top];
        }
    }
}


// Main class
public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get string
        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        // Create Stack
        Stack stack = new Stack(word.length());

        // Push each character into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to reverse the string
        System.out.print("Reversed string: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();
    }
}