import java.util.Scanner;

class Queue {

    private int[] arr;
    private int front;
    private int rear;

    public Queue(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            arr[++rear] = data;
        }
    }

    public int dequeue() {
        return arr[front++];
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


class Stack {

    private int[] arr;
    private int top;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            arr[++top] = data;
        }
    }

    public int pop() {
        return arr[top--];
    }
}


public class RemoveKth {

    public static void main(String[] args) {

        Queue q = new Queue(10);
        Stack s = new Stack(10);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        int k = 3;

        // Remove first K elements and push into Stack
        for (int i = 0; i < k; i++) {
            s.push(q.dequeue());
        }

        // Reverse them and add back to Queue
        while (!s.isEmpty()) {
            q.enqueue(s.pop());
        }

        q.display();
    }
}