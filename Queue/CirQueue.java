class CircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int count;

    public CircularQueue(int size) {
        queue = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        count++;
    }

    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int data = queue[front];

        front = (front + 1) % queue.length;
        count--;

        return data;
    }

    public int peek() {

        if (isEmpty()) {
            return -1;
        }

        return queue[front];
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }

        System.out.println();
    }
}

public class CirQueue {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        q.enqueue(60);
        q.enqueue(70);

        q.display();
    }
}