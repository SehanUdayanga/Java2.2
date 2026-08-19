class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}


class StackLinkedListADT<T> {

    Node<T> top;

    public StackLinkedListADT() {
        top = null;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // push
    public void push(T data) {

        Node<T> newNode = new Node<T>(data);

        if (isEmpty()) {
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
    }

    // pop
    public T pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }

        T data = top.data;
        top = top.next;

        return data;
    }

    // peek
    public T peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }

        return top.data;
    }

    // traversal
    public void traversal() {

        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        Node<T> current = top;

        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}


public class StackLinkedListG {

    public static void main(String[] args) {

        // String Stack
        StackLinkedListADT<String> st = new StackLinkedListADT<>();

        st.push("a");
        st.push("b");
        st.push("c");
        st.push("d");

        System.out.println("Original Stack:");
        st.traversal();

        System.out.println();

        System.out.println(st.pop());

        System.out.println("After pop:");
        st.traversal();

        System.out.println();

        System.out.println("Peek:");
        System.out.println(st.peek());
    }
}