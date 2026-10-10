public class Node {

    int data;
    Node next;
   

    Node(int data) {
        this.data = data;
        this.next=null;
    }
}

public class AdjList{
	int numVertices;
	int maxVertices;
	Node[] adjancencyList;
	
	
	
	public AdjList(int maxVertices){
		this.maxVertices=maxVertices;
		this.numVertices=0;
		this.adjancencyList=new Node[maxVertices];
	}
	
	public boolean isEmpty(){
		return numVertices == 0;
	}
	
	public boolean isFull(){
		return numVertices==maxVertices;
	}
	
	public void addVertece(){
		if(isFull()){
			System.out.println("Tha graphe is full");
			return ;
		}
		
		numVertices++;
		
	}
	public void addEdge(int source ,int destination,int weight){
		if(source>=0 && source<numVertices && destination >=0 && destination<numVertices){
			Node newNode = new Node(destination);
			newNode.next=adjancencyList[source];
			adjancencyList[source]=newNode;
			
			
			/* for udirection graph
			Node newRevNode = new Node(source);
			newRevNode.next = addVertece[destination];
			adjancencyList[destination]=newRevNode; */
			
		}else{
			System.out.println("invalid vertices ");
		}
	
	}
	
	public boolean isEdge(int source,int destination){
		Node curr = adjancencyList[source];
		while (curr !=null){
			if(curr.data ==destination){
				return true;
			}
			curr = curr.next;
		}
		return false
	}
	
	delete vertex
	
	delete Edge 
	
	
	
	public void traversal(){
		for (int i =0;i<numVertices;i++){
			Node curr= addVertece[i];
			System.out.println("Vertex"+i+"is connected to :");
			while(curr !=null){
				System.out.println(curr.data+"");
				curr=curr.next;
			}
			System.out.println();
		}
	}
}