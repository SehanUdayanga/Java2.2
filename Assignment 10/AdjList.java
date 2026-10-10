import java.util.LinkedList;

class AdjList {

    LinkedList<Integer>[] arr;
    int maxVertices;
    int numVertices;

    public AdjList(int maxVertices) {
        this.maxVertices = maxVertices;
        arr = new LinkedList[maxVertices];

        for (int i = 0; i < maxVertices; i++) {
            arr[i] = new LinkedList<>();
        }

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

            if (!arr[source].contains(destination)) {
                arr[source].add(destination);
            }

        } else {
            System.out.println("Invalid vertices");
        }
    }

    public void searchEdge(int source, int destination) {
        if (source >= 0 && source < numVertices &&
            destination >= 0 && destination < numVertices) {

            if (arr[source].contains(destination)) {
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

            if (arr[source].remove(Integer.valueOf(destination))) {
                System.out.println("Edge deleted");
            } else {
                System.out.println("Edge does not exist");
            }

        } else {
            System.out.println("Invalid vertices");
        }
    }

    public void deleteVertex(int vertex) {
        if (vertex < 0 || vertex >= numVertices) {
            System.out.println("Invalid vertex");
            return;
        }

        arr[vertex].clear();

        for (int i = 0; i < numVertices; i++) {
            arr[i].remove(Integer.valueOf(vertex));
        }

        for (int i = vertex; i < numVertices - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[numVertices - 1] = new LinkedList<>();

        numVertices--;

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < arr[i].size(); j++) {
                if (arr[i].get(j) > vertex) {
                    arr[i].set(j, arr[i].get(j) - 1);
                }
            }
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

            if (arr[i].isEmpty()) {
                System.out.print("No nodes");
            } else {
                for (int j : arr[i]) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        AdjList graph = new AdjList(5);

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

        System.out.println("\nAdjacency List:");
        graph.traversal();

        System.out.println("\nSearch Edges:");
        graph.searchEdge(0, 1);
        graph.searchEdge(1, 3);

        System.out.println("\nDelete Edge 0 -> 1:");
        graph.deleteEdge(0, 1);

        System.out.println("\nDelete Node 3:");
        graph.deleteVertex(3);

        System.out.println();
        graph.traversal();

        System.out.println("\nFinally Empty: " + graph.isEmpty());
        System.out.println("Finally Full: " + graph.isFull());
    }
}