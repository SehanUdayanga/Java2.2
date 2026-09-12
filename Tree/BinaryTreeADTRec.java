
public class BinaryTreeADTRec {

    String[] binaryTree;
    int size;
    int capacity;

    // Constructor
    public BinaryTreeADTRec(int capacity) {
        this.capacity = capacity;
        binaryTree = new String[capacity];
        size = 0;
    }

    // Check whether tree is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check whether tree is full
    public boolean isFull() {
        return size == capacity;
    }

    // Insert
    public void insert(String data) {

        if (isFull()) {
            System.out.println("Tree is full");
        } else {
            binaryTree[size] = data;
            size++;

            System.out.println("Inserted : " + data);
        }
    }

    // Search
    public int search(String data) {

        for (int i = 0; i < size; i++) {

            if (binaryTree[i].equals(data)) {
                return i;
            }
        }

        return -1;
    }

    // Level Order Traversal
    public void levelOrderTraversal() {

        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }

        for (int i = 0; i < size; i++) {

            if (binaryTree[i] != null) {
                System.out.print(binaryTree[i] + " ");
            }
        }

        System.out.println();
    }

    // Preorder Traversal
    // Root -> Left -> Right
    public void preOrderTraversal(int index) {

        if (index >= size || binaryTree[index] == null) {
            return;
        }

        System.out.print(binaryTree[index] + " ");

        preOrderTraversal(2 * index + 1);
        preOrderTraversal(2 * index + 2);
    }

    // Inorder Traversal
    // Left -> Root -> Right
    public void inOrderTraversal(int index) {

        if (index >= size || binaryTree[index] == null) {
            return;
        }

        inOrderTraversal(2 * index + 1);

        System.out.print(binaryTree[index] + " ");

        inOrderTraversal(2 * index + 2);
    }

    // Postorder Traversal
    // Left -> Right -> Root
    public void postOrderTraversal(int index) {

        if (index >= size || binaryTree[index] == null) {
            return;
        }

        postOrderTraversal(2 * index + 1);
        postOrderTraversal(2 * index + 2);

        System.out.print(binaryTree[index] + " ");
    }

    // Get parent
    public String getParent(String data) {

        int childIndex = search(data);

        if (childIndex <= 0) {
            return null;
        }

        int parentIndex = (childIndex - 1) / 2;

        return binaryTree[parentIndex];
    }

    // Get children
    public void getChildren(String data) {

        int parentIndex = search(data);

        if (parentIndex == -1) {
            System.out.println("Element not found");
            return;
        }

        int leftIndex = 2 * parentIndex + 1;
        int rightIndex = 2 * parentIndex + 2;

        if (leftIndex < size) {
            System.out.println("Left child : "
                    + binaryTree[leftIndex]);
        } else {
            System.out.println("Left child : None");
        }

        if (rightIndex < size) {
            System.out.println("Right child : "
                    + binaryTree[rightIndex]);
        } else {
            System.out.println("Right child : None");
        }
    }

    // Recursive Height
    public int getHeight(int index) {

        // Base case
        if (index >= size || binaryTree[index] == null) {
            return -1;
        }

        // Find left subtree height
        int leftHeight = getHeight(2 * index + 1);

        // Find right subtree height
        int rightHeight = getHeight(2 * index + 2);

        // Return maximum height + 1
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Get size
    public int getSize() {
        return size;
    }


    // Main method
    public static void main(String[] args) {

        BinaryTreeADTRec tree = new BinaryTreeADTRec(10);

        tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");
        tree.insert("E");
        tree.insert("F");
        tree.insert("G");

        System.out.println("\nLevel Order:");
        tree.levelOrderTraversal();

        System.out.println("\nPreorder:");
        tree.preOrderTraversal(0);

        System.out.println("\n\nInorder:");
        tree.inOrderTraversal(0);

        System.out.println("\n\nPostorder:");
        tree.postOrderTraversal(0);

        System.out.println("\n\nHeight of Tree:");
        System.out.println(tree.getHeight(0));

        System.out.println("\nSize of Tree:");
        System.out.println(tree.getSize());

        System.out.println("\nChildren of B:");
        tree.getChildren("B");

        System.out.println("\nParent of E:");
        System.out.println(tree.getParent("E"));
    }
}

