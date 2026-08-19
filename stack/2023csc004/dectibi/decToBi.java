import java.util.Scanner;


// Stack ADT using Array
class Stack {

    int top;
    int maxSize;
    int arr[];

    // Constructor
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
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
    public void push(int data) {

        if (isFull()) {
            System.out.println("Stack overflow");
        }
        else {
            arr[++top] = data;
        }
    }

    // Pop
    public int pop() {

        if (isEmpty()) {
            return -1;
        }

        return arr[top--];
    }

    // Peek
    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    // Display
    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


// Main class
public class decToBi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        // Create stack
        Stack stack = new Stack(32);

        int number = decimal;

        // Special case for 0
        if (number == 0) {
            System.out.println("Binary: 0");
            return;
        }

        // Convert decimal to binary
        while (number > 0) {

            int remainder = number % 2;

            stack.push(remainder);

            number = number / 2;
        }

        // Print binary representation
        System.out.print("Binary: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();
    }
}