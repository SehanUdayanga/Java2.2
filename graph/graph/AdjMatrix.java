class AdjMatrix{
	
	int [][] arr;
	int maxVertices;
	int numVertices;
	
	
	
	public AdjMatrix(int maxVertices){
		this.maxVertices=maxVertices;
		arr = new int [maxVertices][maxVertices];
		numVertices=0;
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
			arr[source][destination]=weight ;
			
			/*undirection grapth
			arr[source][destination]=1;
			arr[destination][source]=1; */
		}else{
			System.out.println("invalid vertices ");
		}
	
	}
	
	public void traversal(){
		if(isEmpty()){
			System.out.println("The graph is empty");
		}else if(isFull()){
			System.out.println("The grapg is full");
		}
		
		for (int i=0 ; i<numVertices;i++){
			System.out.println("vertex"+i+"is connect to");
			for (int j=0;j<numVertices;j++){
				if (arr[i][j]!=0){
					System.out.println(j+" ");
				}
				
			}
			System.out.println ();
		}
	}
	
	
	public void deleteVertice(int vertex){
		if(vertex >=0 && vertex<numVertices){
			for(int i=0;i<numVertices;i++){
				arr[i][vertex]=0;
				arr[vertex][i]=0;
			}
		}else{
			System.out.println("invalid index");
		}
		//meke aulk thiyanwa 0 wena vertrx shft kalanam eeka hariynwaa
	}
	
	public void deleteEdge(int source ,int destination){
		if(source>=0 && source<numVertices && destination >=0 && destination<numVertices){
			arr[source][destination]=0 ;
			
			/*undirection grapth
			arr[source][destination]=0;
			arr[destination][source]=0; */
		}else{
			System.out.println("invalid vertices ");
		}
	
	}
	
	
	public void  search(int source,int destination){
		
	}
	
	
	public static void main(String[] args){
		AdjMatrix matrix = new AdjMatrix(5);
		
		matrix.addVertece();
		matrix.addEdge(0,1,5);
		matrix.addEdge(1,2,1);
		matrix.addEdge(2,2,2);
		matrix.addEdge(3,2,4);
		matrix.traversal();
		matrix.deleteVertice(2);
		matrix.deleteEdge(1,2);
	}
}