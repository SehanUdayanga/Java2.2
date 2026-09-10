class TreeADTG<T> {

    int maxSize;
    T[] arr;
    int size = 0;

   
    public TreeADT(int maxSize) {
        this.maxSize = maxSize;
        arr = (T[]) new Object[maxSize];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void insert(T data) {

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


    // Preorder: Root → Left → Right
    public void preOrderTraversal(int index) {

        if (index >= size) {
            return;
        }

        System.out.print(arr[index] + " ");

        preOrderTraversal(2 * index + 1);
        preOrderTraversal(2 * index + 2);
    }


    // Inorder: Left → Root → Right
    public void inOrderTraversal(int index) {

        if (index >= size) {
            return;
        }

        inOrderTraversal(2 * index + 1);

        System.out.print(arr[index] + " ");

        inOrderTraversal(2 * index + 2);
    }


    // Postorder: Left → Right → Root
    public void postOrderTraversal(int index) {

        if (index >= size) {
            return;
        }

        postOrderTraversal(2 * index + 1);
        postOrderTraversal(2 * index + 2);

        System.out.print(arr[index] + " ");
    }


    public static void main(String[] args) {

        // Integer Tree
        TreeADT<Integer> tree = new TreeADT<>(10);

        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);
        tree.insert(1);

        System.out.print("Array: ");
        tree.display();

        System.out.print("Preorder: ");
        tree.preOrderTraversal(0);

        System.out.print("\nInorder: ");
        tree.inOrderTraversal(0);

        System.out.print("\nPostorder: ");
        tree.postOrderTraversal(0);
    }
}