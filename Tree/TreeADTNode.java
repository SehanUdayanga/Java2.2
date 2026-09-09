class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


class TreeADTNode {

    Node root;
    int size = 0;


    // Check whether tree is empty
    public boolean isEmpty() {
        return root == null;
    }


    // Insert root
    public void insert(int data) {

        Node newNode = new Node(data);

        if (isEmpty()) {
            root = newNode;
            size++;
        }
    }


    // Preorder: Root → Left → Right
    public void preOrder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");

        preOrder(node.left);
        preOrder(node.right);
    }


    // Inorder: Left → Root → Right
    public void inOrder(Node node) {

        if (node == null) {
            return;
        }

        inOrder(node.left);

        System.out.print(node.data + " ");

        inOrder(node.right);
    }


    // Postorder: Left → Right → Root
    public void postOrder(Node node) {

        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);

        System.out.print(node.data + " ");
    }


    public static void main(String[] args) {

        TreeADTNode tree = new TreeADTNode();

        // Create root
        tree.insert(2);

        // Create the tree
        tree.root.left = new Node(3);
        tree.root.right = new Node(4);

        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(7);

        tree.root.right.left = new Node(9);
        tree.root.right.right = new Node(1);


        // Preorder
        System.out.print("Preorder: ");
        tree.preOrder(tree.root);


        // Inorder
        System.out.print("\nInorder: ");
        tree.inOrder(tree.root);


        // Postorder
        System.out.print("\nPostorder: ");
        tree.postOrder(tree.root);
    }
}