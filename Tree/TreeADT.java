class TreeADT {

    int maxSize;
    int[] arr;
    int size = 0;

    public TreeADT(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void insert(int data) {

        if (isFull()) {
            System.out.println("The tree is full");
        } else {
            arr[size++] = data;
        }
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("The tree is empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public void inOrderTraversal(int index) {

        // Stop when index goes outside the tree
        if (index >= size) {
            return;
        }

        // Left subtree
        inOrderTraversal(2 * index + 1);

        // Root
        System.out.print(arr[index] + " ");

        // Right subtree
        inOrderTraversal(2 * index + 2);
    }

    public static void main(String[] args) {

        TreeADT tree = new TreeADT(10);

        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);
        tree.insert(1);

        System.out.println("Array:");
        tree.display();

        System.out.println("Inorder:");
        tree.inOrderTraversal(0);
    }
}