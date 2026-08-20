class Node{
	
	Node next;
	String data;
	
	Node(){
		this.next=null;
	}
}

class Queue{
	int front ;
	int rear;
	
	
	public Queue(){	
		this.fornt=null;
		this.rear=null;
	}
	
	public boolean isEmpty(){
		return fornt==null;
	}
	
	public void enQueue(String data){
		Node newNode = new Node(data);
		if(isEmpty()){
			front=newNode;
			rear=newNode;
		}else{
			rear.next=newNode;
			rear=newNode;
		}
	}
	
	public String  deQueue(){
		if(isEmpty()){
			System.out.println("The Queue is Empty ");
			return null;
		}else{
			int data=front.data;
			front=front.next;
			if(front==null){
				rear=null;
			}
			return data;
		}
		
		
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("The Queue is Empty");
		}else{
			Node current =front;
			while(current!=null){
				System.out.println(current.data);
				current=current.next;
			}
		}
	}
}

public class QueueADTLink{
	public static void main(Srting args[]){
		Queue queue = new Queue();
	}
}