public class CircularQueueADT<T> {

    private T[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    
     
    CircularQueueADT(int capacity) {
        this.capacity = capacity;
        queue = (T[]) new Object[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

     
    public void enqueue(T data) {

        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;

        System.out.println(data + " inserted");
    }

   
    public T dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        T data = queue[front];

        queue[front] = null;
        front = (front + 1) % capacity;
        size--;

        return data;
    }

   
    public T peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        return queue[front];
    }

     
    public boolean isEmpty() {
        return size == 0;
    }

    
    public boolean isFull() {
        return size == capacity;
    }

    
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }

        System.out.println();
    }

     
    public static void main(String[] args) {

        CircularQueueADT<Integer> queue =
                new CircularQueueADT<>(5);

        // Insert elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        // Remove elements
        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());

        queue.display();

        // Circular nature
        queue.enqueue(60);
        queue.enqueue(70);

        queue.display();

        // Peek
        System.out.println("Front element: " + queue.peek());
    }
}