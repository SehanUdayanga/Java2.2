class LinkedQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;

    public LinkedQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {

        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {

        if (isEmpty()) {
            return -1;
        }

        int data = front.data;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    public void display() {

        Node current = front;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public int size() {

        int count = 0;
        Node current = front;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}


public class Interleave {

    public static void main(String[] args) {

        LinkedQueue q = new LinkedQueue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        int n = q.size();
        int half = n / 2;

        LinkedQueue firstHalf = new LinkedQueue();

        // Move first half to another queue
        for (int i = 0; i < half; i++) {
            firstHalf.enqueue(q.dequeue());
        }

        // Interleave
        while (!firstHalf.isEmpty()) {

            System.out.print(firstHalf.dequeue() + " ");
            System.out.print(q.dequeue() + " ");
        }
    }
}