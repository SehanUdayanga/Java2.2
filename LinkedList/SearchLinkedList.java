class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchLinkedList {

    static boolean search(Node head, int key) {

        Node current = head;

        while (current != null) {

            if (current.data == key) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println(search(head, 30)); // true
        System.out.println(search(head, 50)); // false
    }
}