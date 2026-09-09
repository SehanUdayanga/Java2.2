public class BinaryTreeADT{
	int size;
	int [] binarytree;
	int capacity;
	
	public BinaryTreeADT(int capacity){
		this.capacity = capacity;
		binarytree = new int [capacity];
		this.size = 0;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public boolean isFull(){
		return size == capacity;
	}
	
	public void insert(int data){
		if(isFull()){
			System.out.println("Tree is full");
		}
		else{
			binarytree[size] = data;
			size++;
			System.out.println("Inserted : "+ data);
		}
	}
	
	public void levelOrderTraversal(){
		if(isEmpty()){
			System.out.print("Tree is empty");
		}
		else{
			for(int i = 0;i<size;i++){
				if(binarytree[i] != 0){
					System.out.print(binarytree[i] + " ");
				}
			}
		}
	}
	
	public void InOrderTraversal(int index){
		if(isEmpty())
			System.out.print("Tree is empty");
		else{
			if (index < 0 || index >= size){
				System.out.println("Index is not correct");
				return;
			}else{
				InOrderTraversal(2 * index + 1);
				System.out.print(binarytree[index] + " ");
				InOrderTraversal(2 * index + 2);
			}
		}
	}
	
	public static void main(String [] args){
		BinaryTreeADT binaryTree = new BinaryTreeADT(10);
		
		binaryTree.insert(5);
		binaryTree.insert(3);
		binaryTree.insert(9);
		binaryTree.insert(2);
		binaryTree.insert(4);
		binaryTree.insert(7);
		binaryTree.insert(1);
		System.out.println();
		binaryTree.InOrderTraversal(3);
		binaryTree.levelOrderTraversal();
	}
}