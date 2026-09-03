class PriorityQueue {

    private int[] queue;
    private int size;

    public PriorityQueue(int capacity) {
        queue = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    // Insert in increasing order
    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Priority Queue is Full");
            return;
        }

        int i = size - 1;

        // Shift larger elements to the right
        while (i >= 0 && queue[i] > data) {
            queue[i + 1] = queue[i];
            i--;
        }

        queue[i + 1] = data;
        size++;
    }

    // Remove highest priority element
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Priority Queue is Empty");
            return -1;
        }

        int data = queue[0];

        // Shift remaining elements left
        for (int i = 0; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }

        size--;

        return data;
    }

    public int peek() {

        if (isEmpty()) {
            return -1;
        }

        return queue[0];
    }

    public void display() {

        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
}


public class PrioQueue {

    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue(10);

        pq.enqueue(30);
        pq.enqueue(10);
        pq.enqueue(40);
        pq.enqueue(20);
        pq.enqueue(5);

        pq.display();

        System.out.println("Removed: " + pq.dequeue());

        pq.display();
    }
}