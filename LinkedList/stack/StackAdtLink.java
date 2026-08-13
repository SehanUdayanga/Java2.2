
class Node{
	Node next;
	String  data;
	
	public Node(String  data){
		this.data= data;
		this.next=null;
	}
}

class Stack{
	Node top;
	
	public Stack(){
		this.top=null;
	}
	
	public boolean isEmpty(){
		return top==null;
	}
	
	
	public void push(String data){
		Node newNode = new Node(data);
		if(isEmpty()){
			top = newNode;
		}else{
			newNode.next=top;
			top=newNode;
		}
	}
	
	public String  pop(){
		if(isEmpty()){
			System.out.println("The linklist is Empty");
			return null;
		}else{
			String data =top.data;
			
			top =top.next;
			return data;
		}
	}
	
	
	public void display(){
		if(isEmpty()){
			System.out.println("Stack is empty ");
		}else{
			
			
			while(top.next!=null){
				System.out.println(top.data);
				top=top.next;
				
			}
			System.out.println(top.data);
			
		}
	}
	
	
}

public class StackAdtLink{
	
	public static void main(String args[]){
		Stack stack = new Stack();
		System.out.println(stack.isEmpty());
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		//stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}
}