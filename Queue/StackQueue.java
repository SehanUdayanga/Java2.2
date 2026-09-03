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

        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }

        arr[++top] = data;
    }

    public int pop() {

        if (isEmpty()) {
            return -1;
        }

        return arr[top--];
    }

    public int peek() {

        if (isEmpty()) {
            return -1;
        }

        return arr[top];
    }
}


class QueueUsingStacks {

    private Stack stack1;
    private Stack stack2;

    public QueueUsingStacks(int size) {

        stack1 = new Stack(size);
        stack2 = new Stack(size);
    }

    // Enqueue
    public void enqueue(int data) {

        stack1.push(data);
    }

    // Dequeue
    public int dequeue() {

        // Move elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Remove first queue element
        int data = stack2.pop();

        // Move remaining elements back
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return data;
    }
}


public class StackQueue{

    public static void main(String[] args) {

        QueueUsingStacks q = new QueueUsingStacks(10);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}