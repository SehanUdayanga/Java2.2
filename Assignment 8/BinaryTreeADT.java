public class BinaryTreeADT {

    String[] binaryTree;
    int size;
    int capacity;

    // Constructor
    public BinaryTreeADT(int capacity) {
        this.capacity = capacity;
        binaryTree = new String[capacity];
        size = 0;
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check full
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

    // Search an element
    public int search(String element) {

        for (int i = 0; i < size; i++) {

            if (binaryTree[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    // 1. Get children of a given element
    public void getChildren(String element) {

        int parentIndex = search(element);

        if (parentIndex == -1) {
            System.out.println("Element not found");
            return;
        }

        int leftIndex = 2 * parentIndex + 1;
        int rightIndex = 2 * parentIndex + 2;

        System.out.println("Parent : " + element);

        // Left child
        if (leftIndex < size && binaryTree[leftIndex] != null) {
            System.out.println("Left child : " + binaryTree[leftIndex]);
        } else {
            System.out.println("Left child : None");
        }

        // Right child
        if (rightIndex < size && binaryTree[rightIndex] != null) {
            System.out.println("Right child : " + binaryTree[rightIndex]);
        } else {
            System.out.println("Right child : None");
        }
    }

    // 2. Get parent of an element
    public String getParent(String element) {

        int childIndex = search(element);

        if (childIndex == -1) {
            return null;
        }

        // Root has no parent
        if (childIndex == 0) {
            return null;
        }

        int parentIndex = (childIndex - 1) / 2;

        return binaryTree[parentIndex];
    }

    // 3. Set right child
    public void setRightChild(String parent, String data) {

        int parentIndex = search(parent);

        if (parentIndex == -1) {
            System.out.println("Parent not found");
            return;
        }

        int rightIndex = 2 * parentIndex + 2;

        if (rightIndex >= capacity) {
            System.out.println("Cannot add right child");
            return;
        }

        binaryTree[rightIndex] = data;

        // Update size
        if (rightIndex >= size) {
            size = rightIndex + 1;
        }

        System.out.println("Right child of " + parent + " set to " + data);
    }

    // 4. Set parent of y as g
    // This means: make y a child of g
    public void setParent(String child, String parent) {

        int parentIndex = search(parent);

        if (parentIndex == -1) {
            System.out.println("Parent not found");
            return;
        }

        int childIndex = search(child);

        if (childIndex == -1) {
            System.out.println("Child not found");
            return;
        }

        // Find available child position
        int leftIndex = 2 * parentIndex + 1;
        int rightIndex = 2 * parentIndex + 2;

        if (leftIndex < capacity && binaryTree[leftIndex] == null) {

            binaryTree[leftIndex] = child;

            if (leftIndex >= size) {
                size = leftIndex + 1;
            }

        } else if (rightIndex < capacity && binaryTree[rightIndex] == null) {

            binaryTree[rightIndex] = child;

            if (rightIndex >= size) {
                size = rightIndex + 1;
            }

        } else {
            System.out.println("Parent already has two children");
            return;
        }

        System.out.println("Parent of " + child + " set to " + parent);
    }

    // 5. Find height of tree
    public int getHeight() {

        if (isEmpty()) {
            return -1;
        }

        return (int) (Math.log(size) / Math.log(2));
    }

    // 6. Find size
    public int getSize() {
        return size;
    }

    // Level order traversal
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

    // Main
    public static void main(String[] args) {

        BinaryTreeADT tree = new BinaryTreeADT(20);

        tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");
        tree.insert("E");
        tree.insert("F");
        tree.insert("G");
        tree.insert("H");
        tree.insert("I");
        tree.insert("J");
        tree.insert("K");
        tree.insert("L");
        tree.insert("M");
        tree.insert("N");

        System.out.println("Tree:");
        tree.levelOrderTraversal();

 
        System.out.println("1. Children of Y:");
        tree.getChildren("Y");

        System.out.println("2. Parent of R:");
        System.out.println(tree.getParent("R"));

        
        System.out.println("3. Set right child of N as O:");
        tree.setRightChild("N", "O");

        
        System.out.println("4. Set parent of Y as G:");
        tree.setParent("Y", "G");

       
        System.out.println("5. Height of tree:");
        System.out.println(tree.getHeight());

        System.out.println("6. Size of tree:");
        System.out.println(tree.getSize());

        System.out.println("Final Tree:");
        tree.levelOrderTraversal();
    }
}