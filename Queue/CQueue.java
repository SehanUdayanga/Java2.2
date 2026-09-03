class CircularQueue {

    private class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node rear;

    public CircularQueue() {
        rear = null;
    }

    // Check empty
    public boolean isEmpty() {
        return rear == null;
    }

    // Add element
    public void enqueue(int data) {

        Node newNode = new Node(data);

        if (isEmpty()) {

            rear = newNode;
            rear.next = rear;

        } else {

            newNode.next = rear.next;
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Remove element
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        Node front = rear.next;

        // Only one node
        if (front == rear) {

            rear = null;

        } else {

            rear.next = front.next;
        }

        return front.data;
    }

    // View front
    public int peek() {

        if (isEmpty()) {
            return -1;
        }

        return rear.next.data;
    }

    // Display
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node front = rear.next;
        Node current = front;

        do {

            System.out.print(current.data + " ");
            current = current.next;

        } while (current != front);

        System.out.println();
    }
}


public class CQueue {

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        System.out.println("Removed: " + q.dequeue());

        q.display();

        System.out.println("Front: " + q.peek());
    }
}