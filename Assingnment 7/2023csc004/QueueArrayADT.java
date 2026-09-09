public class QueueArrayADT<T> {

    private T[] queue;
    private int front;
    private int rear;
    private int size;

     
    @SuppressWarnings("unchecked")
    QueueArrayADT(int capacity) {
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

        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        size++;
    }

   
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        T data = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
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
        return size == queue.length;
    }

   
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }

        System.out.println();
    }

  
    public static void main(String[] args) {

        QueueArrayADT<Integer> queue = new QueueArrayADT<>(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Front element: " + queue.peek());

        System.out.println("Removed: " + queue.dequeue());

        queue.display();

        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        System.out.println("Front element: " + queue.peek());
    }
}