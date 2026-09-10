public class BinaryTreeADTA{
	int size;
	int [] binarytree;
	int capacity;
	
	public BinaryTreeADT(int capacity){
		this.capacity = capacity;
		binarytree = new String  [capacity];
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
	
	public void delete(int data) {
    int index = search(data);

    if (index == -1) {
        System.out.println("Element not found");
        return;
    }

    // Shift elements to the left
    for (int i = index; i < size - 1; i++) {
        binarytree[i] = binarytree[i + 1];
    }

    size--;

    // Clear the last position
    binarytree[size] = 0;

    System.out.println("Deleted : " + data);
	}
	 
	
	 public int search(String  element){
		if(isEmpty()){
			System.out.println("Tree is empty");
			return -1;
		else{
			for(int i =0;i<size;i++){
				if(element==binarytree[i]){
					return i;
				}
			}
		}
	}
	public void preOrderTraversal(int index) {

        if (index >= size || index<0) {
            return;
        
		if(binarytree[index]==0){
			System.out.println("- ");
			return
		}

        System.out.print(arr[index] + " ");

        preOrderTraversal(2 * index + 1);
        preOrderTraversal(2 * index + 2);
    }


    // Inorder: Left → Root → Right
    public void inOrderTraversal(int index) {

        if (index >= size || index<0)) {
            return;
        }
		
		if(binarytree[index]==0){
			System.out.println("- ")
			return
		}

        inOrderTraversal(2 * index + 1);

        System.out.print(arr[index] + " ");

        inOrderTraversal(2 * index + 2);
    }


     // Postorder: Left → Right → Root
    public void postOrderTraversal(int index) {

        if (index >= size || index<0)) {
            return;
        }
		
		if(binarytree[index]==0){
			System.out.println("- ")
			return
		}

        postOrderTraversal(2 * index + 1);
        postOrderTraversal(2 * index + 2);

        System.out.print(arr[index] + " ");
    }
		
	public void getChildren(String element){
		int parentIndex=search(element);
		String leftchild = binarytree[(2*parentIndex)+1];
		String rightchild = binaryTree[(2*parentIndex)+2];
		System.out.println("leftchild : "+leftchild
		System.out.println("right child : "+rightchild);
	
	
	
	/* public String getleftChild(String parent){
		int paratIndex = search(parent)
	} */
	
	
	public String getParent(String element){
		int childIndex = search(element);
		
		
		if (childIndex !=-1){
			int parentIndex = ((childIndex-1)/);
			if(parentIndex>=0){
					return binarytree[parentIndex];
		}
		}
		return null;
		

	}
	
	public void setRightChild(String parent,String data){
int paratenindex= search(parent);
			if(paratIndex!=-1){
				int rightchild = 
			}
	}

public int getHeight(){
	if (isEmpty()){
		return -1;
	}
	
	return (int) (Math.log(size)/Math.log(2));
}
	
	 
/*
	public void InOrderTraversal(int index){
		if(isEmpty())System.out.println("The tree is empty ")
			System.out.print("Tree is empty");
		else{
			if (index < 0 || index >= size){
				System.out.println("Index is not correct");
				return;
			else if(binaryTree[index]==0){
				System.out.println("_");
				return;
			
			}else{
				InOrderTraversal(2 * index + 1);
				System.out.print(binarytree[index] + " ");
				InOrderTraversal(2 * index + 2);
			}
		}
	}
	
	public void postOrderTraversal(int index){
		if(isEmpty())System.out.println("The tree is empty ")
			System.out.print("Tree is empty");
		else{
			if (index < 0 || index >= size){
				System.out.println("Index is not correct");
				return;
			else if(binaryTree[index]==0){
				System.out.println("_");
				return;
			
			}else{
				InOrderTraversal(2 * index + 1);
				
				InOrderTraversal(2 * index + 2);
				System.out.print(binarytree[index] + " ");
			}
		}
	}
	
	public void preOrderTraversal(int index){
		if(isEmpty())System.out.println("The tree is empty ")
			System.out.print("Tree is empty");
		else{
			if (index < 0 || index >= size){
				System.out.println("Index is not correct");
				return;
			else if(binaryTree[index]==0){
				System.out.println("_");
				return;
			
			}else
				System.out.print(binarytree[index] + " ");
				InOrderTraversal(2 * index + 1);
				
				InOrderTraversal(2 * index + 2);
				
			}
		}
	}*/
	
	public static void main(String [] args){
		BinaryTreeADT binaryTree = new BinaryTreeADT(10);
		
		binaryTree.insert("A");
		binaryTree.insert("B");
		binaryTree.insert("C");
		binaryTree.insert("D");
		/* binaryTree.insert(6);
		binaryTree.insert(9);
		binaryTree.insert(1); */
		System.out.println();
		/* binaryTree.inOrderTraversal(3);
		binaryTree.levelOrderTraversal();
		binaryTree.preOrderTraversal(3);
		binaryTree.postOrderTraversal(3);	 */	
		
	}
}