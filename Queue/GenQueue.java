class GenericQueue<T> {

    private T[] queue;
    private int front;
    private int rear;

    public GenericQueue(int size) {
        queue = (T[]) new Object[size];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear < front;
    }

    public boolean isFull() {
        return rear == queue.length - 1;
    }

    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            queue[++rear] = data;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        return queue[front++];
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class GenQueue {
    public static void main(String[] args) {

        GenericQueue<Integer> q = new GenericQueue<>(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Removed: " + q.dequeue());

        q.display();
    }
}