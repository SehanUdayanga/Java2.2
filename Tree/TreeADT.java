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


    // PREORDER
    // Root → Left → Right
    public void preOrderTraversal(int index) {

        if (index >= size) {
            return;
        }

        // Root
        System.out.print(arr[index] + " ");

        // Left
        preOrderTraversal(2 * index + 1);

        // Right
        preOrderTraversal(2 * index + 2);
    }


    // INORDER
    // Left → Root → Right
    public void inOrderTraversal(int index) {

        if (index >= size) {
            return;
        }

        // Left
        inOrderTraversal(2 * index + 1);

        // Root
        System.out.print(arr[index] + " ");

        // Right
        inOrderTraversal(2 * index + 2);
    }


    // POSTORDER
    // Left → Right → Root
    public void postOrderTraversal(int index) {

        if (index >= size) {
            return;
        }

        // Left
        postOrderTraversal(2 * index + 1);

        // Right
        postOrderTraversal(2 * index + 2);

        // Root
        System.out.print(arr[index] + " ");
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