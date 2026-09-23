public class BinarySearchTree {

    Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // Insert
    public void insert(int data) {

        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;

        while (true) {

            if (data < current.data) {

                if (current.left == null) {
                    current.left = newNode;
                    return;
                }

                current = current.left;

            } else {

                if (current.right == null) {
                    current.right = newNode;
                    return;
                }

                current = current.right;
            }
        }
    }

    // Inorder
    public void inorder(Node node) {

        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Preorder
    public void preorder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Postorder
    public void postorder(Node node) {

        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Search
    public boolean search(int data) {

        Node current = root;

        while (current != null) {

            if (data == current.data) {
                return true;
            }

            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    // Find minimum
    public int findMin() {

        Node current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    // Find maximum
    public int findMax() {

        Node current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    // Delete
    public Node delete(Node node, int data) {

        if (node == null) {
            return null;
        }

        if (data < node.data) {

            node.left = delete(node.left, data);

        } else if (data > node.data) {

            node.right = delete(node.right, data);

        } else {

            // No child
            if (node.left == null && node.right == null) {
                return null;
            }

            // Only right child
            if (node.left == null) {
                return node.right;
            }

            // Only left child
            if (node.right == null) {
                return node.left;
            }

            // Two children
            int min = findMin(node.right);

            node.data = min;

            node.right = delete(node.right, min);
        }

        return node;
    }

    // Find minimum in a subtree
    public int findMin(Node node) {

        Node current = node;

        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    // Delete value
    public void delete(int data) {

        root = delete(root, data);
    }

    // Main
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        // Insert
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Traversals
        System.out.println("Inorder:");
        tree.inorder(tree.root);

        System.out.println("\n\nPreorder:");
        tree.preorder(tree.root);

        System.out.println("\n\nPostorder:");
        tree.postorder(tree.root);

        // Search
        System.out.println("\n\nSearch 40:");
        System.out.println(tree.search(40) ? "Found" : "Not Found");

        System.out.println("Search 90:");
        System.out.println(tree.search(90) ? "Found" : "Not Found");

        // Minimum
        System.out.println("\nMinimum: " + tree.findMin());

        // Maximum
        System.out.println("Maximum: " + tree.findMax());

        // Delete
        tree.delete(80);
        tree.delete(70);
        tree.delete(30);

        // Final traversal
        System.out.println("\nAfter Deletion - Inorder:");
        tree.inorder(tree.root);

        System.out.println("\nAfter Deletion - Preorder:");
        tree.preorder(tree.root);

        System.out.println("\nAfter Deletion - Postorder:");
        tree.postorder(tree.root);
    }
}