class TreeADT{
	int maxSize  ;
	int [] arr;
	int size=0;
	
	public TreeADT(int maxSize){
		this.maxSize=maxSize;
		arr= new int[maxSize];
	}	
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public boolean isFull(){
		return size==maxSize;
	}	
	
	public void insert(int data ){
		if(isFull()){
			System.out.println("The tree is full");
		}else{
			arr[size++]=data;
		}	
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("The tree is full");
		}else{
			for(int i=0;i<=size-1;i++){
				if(arr[i] !=0){
						System.out.print(arr[i] +" ");
				}
			}
		}
	}		
			
			
	public void inOrderTravesel(int index){
		if(isEmpty()) System.out.println("it is empty");
		else{
			if(index<0 || index>=size){
				System.out.println("index not correct");
				return;
			}else{
				inOrderTravesel(2*index+1);
				System.out.println(arr[index]+" ");
				inOrderTravesel(2*index+2);
			}
		}
		
	}
	
	
	
	public static void main(String [] args){
		TreeADT tree = new TreeADT(10);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);
		tree.insert(1);
		tree.inOrderTravesel(2);
		
	}
}
