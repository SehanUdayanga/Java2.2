class AdjMatrix {

    int[][] arr;
    int maxVertices;
    int numVertices;

    public AdjMatrix(int maxVertices) {
        this.maxVertices = maxVertices;
        arr = new int[maxVertices][maxVertices];
        numVertices = 0;
    }

    public boolean isEmpty() {
        return numVertices == 0;
    }

    public boolean isFull() {
        return numVertices == maxVertices;
    }

    public void addVertex() {
        if (isFull()) {
            System.out.println("Graph is Full");
            return;
        }

        numVertices++;
        System.out.println("Node inserted");
    }

    public void addEdge(int source, int destination) {
        if (source >= 0 && source < numVertices &&
            destination >= 0 && destination < numVertices) {

            arr[source][destination] = 1;

        } else {
            System.out.println("Invalid vertices");
        }
    }

    public void searchEdge(int source, int destination) {
        if (source >= 0 && source < numVertices &&
            destination >= 0 && destination < numVertices) {

            if (arr[source][destination] == 1) {
                System.out.println(source + " -> " + destination
                                   + " exists");
            } else {
                System.out.println(source + " -> " + destination
                                   + " does not exist");
            }

        } else {
            System.out.println("Invalid vertices");
        }
    }

    public void deleteEdge(int source, int destination) {
        if (source >= 0 && source < numVertices &&
            destination >= 0 && destination < numVertices) {

            arr[source][destination] = 0;
            System.out.println("Edge deleted");

        } else {
            System.out.println("Invalid vertices");
        }
    }

    public void deleteVertex(int vertex) {
        if (vertex < 0 || vertex >= numVertices) {
            System.out.println("Invalid vertex");
            return;
        }

        for (int i = vertex; i < numVertices - 1; i++) {
            for (int j = 0; j < numVertices; j++) {
                arr[i][j] = arr[i + 1][j];
            }
        }

        for (int i = 0; i < numVertices - 1; i++) {
            for (int j = vertex; j < numVertices - 1; j++) {
                arr[i][j] = arr[i][j + 1];
            }
        }

        numVertices--;

        for (int i = 0; i < maxVertices; i++) {
            arr[numVertices][i] = 0;
            arr[i][numVertices] = 0;
        }

        System.out.println("Node deleted");
    }

    public void traversal() {
        if (isEmpty()) {
            System.out.println("Graph is Empty");
            return;
        }

        System.out.println("Graph Traversal:");

        for (int i = 0; i < numVertices; i++) {
            System.out.print("Node " + i + " connects to: ");

            boolean found = false;

            for (int j = 0; j < numVertices; j++) {
                if (arr[i][j] == 1) {
                    System.out.print(j + " ");
                    found = true;
                }
            }

            if (!found) {
                System.out.print("No nodes");
            }

            System.out.println();
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        AdjMatrix graph = new AdjMatrix(5);

        System.out.println("Initially Empty: " + graph.isEmpty());
        System.out.println("Initially Full: " + graph.isFull());

        for (int i = 0; i < 5; i++) {
            graph.addVertex();
        }

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);
        graph.addEdge(4, 3);

        System.out.println("\nAdjacency Matrix:");
        graph.displayMatrix();

        System.out.println("\nSearch Edges:");
        graph.searchEdge(0, 1);
        graph.searchEdge(1, 3);

        System.out.println("\nDelete Edge 0 -> 1:");
        graph.deleteEdge(0, 1);

        System.out.println("\nDelete Node 3:");
        graph.deleteVertex(3);

        System.out.println();
        graph.traversal();

        System.out.println("\nUpdated Adjacency Matrix:");
        graph.displayMatrix();

        System.out.println("\nFinally Empty: " + graph.isEmpty());
        System.out.println("Finally Full: " + graph.isFull());
    }
}