class LinkedListADT{
	Node head;
	public LinkedListADT(){
		this.head=null;
	}	
	
	public boolean isEmpty(){
		/* if(head==null){
			return true;
		}
		
		return false; */
		return (head==null)? true:false;
	}
	
	public void insertFront(int a){
		Node newNode = new Node(a);
		if(isEmpty()){
			head=newNode;
		}else{
			newNode.next=head;
			head=newNode;
		}
		
	}
	
	public void insertLast(int data){
		Node newNode = new Node(data);
		if(isEmpty()){
			head=newNode;
		}else{
			Node current =head;
			while(current.next != null){
				current=current.next;
			}
			current.next=newNode;
		}
	}
	
	public int getSize(){
		Node current=head;
		int size=0;
		while(current!=null){
			current=current.next;
			size++;
		}
		return size;
	}
	
	public void insertPosition(int data,int index){
		if(index<1 || index>getSize()+1 ){
			System.out.println("Invalid index ");
			return;
		}else if(index==1){
			 insertFront(data);
			 return;
		}
		
		Node newNode= new Node(data);
		Node current = head;
		for(int c=1;c<index-1;c++){
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
	}
	
	public void deletFront(){
		if(isEmpty()){
			System.out.println("LinkedLIst is empty");
		}
		head=head.next;
		
	}
	
	public void deletLast(){
		if(isEmpty()){
			System.out.println("LinkedLIst is empty");
		}
		Node current=head;
		Node previous =null;
		while(current.next != null){
			previous=current;
			current=current.next;
		}
		previous.next=null;
	}
	
	public void deletePosition(int index){
		if(index<1 || index>getSize() ){
			System.out.println("Invalid index ");
			return;
		}else if(index==1){
			 deletFront();
			 return;
		}
		
		Node current=head;
		
		for(int c=1;c<index-1;c++){
			
			current=current.next;
		}
		current.next=current.next.next;
		
	}
	public void traversal(){
		
		if(isEmpty()){
			System.out.println("LInked list is empty ");
		}else{
			Node current=head;
			while(current!=null){
				
				System.out.print(current.data +" ");
				current = current.next;
			}
			
		}
		
		
		
		
	}
	
	
	
}

class Node{
	
	int data;
	Node next;
	
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class SinglyLinkedList{
	public static void main(String args[]){
		LinkedListADT linkedList= new LinkedListADT();
		
		System.out.println(linkedList.isEmpty());
		
		linkedList.insertFront(14);
		linkedList.insertFront(12);
		System.out.println(linkedList.isEmpty());
		
		linkedList.traversal();
		
		linkedList.insertLast(15);
		linkedList.insertLast(16);
		linkedList.insertLast(17);
		linkedList.traversal();
		
		
		System.out.println(linkedList.getSize());
		linkedList.insertPosition(10,2);
		linkedList.traversal();
		
		linkedList.deletFront();
		System.out.println(" ");
		linkedList.traversal();
		
		
		linkedList.deletLast();
		System.out.println(" ");
		linkedList.traversal();
		
		System.out.println(" ");
		linkedList.deletePosition(2);
		linkedList.traversal();

		
	}
	
}