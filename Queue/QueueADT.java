class Queue{
	int front;
	int rear;
	int maxSize;
	String arr [];
	
	public Queue(int maxSize){
		this.front=0;
		this.rear=-1;
		this.maxSize=maxSize;
		arr=new String [maxSize];
		
	}
	
	public boolean isEmpty(){
		return rear ==-1;
	}
	
	public boolean isFull(){
		return rear == maxSize-1;
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}else{
			for(int i=front;i<rear;i++){
				System.out.print(arr[i]);
			}
		}
	}
	
	public void enQueue(String data ){
		if(isFull()){
			System.out.println("Queue Overflow");
		}else{
			arr[++rear]=data;
			
		}
	}
	
	public String deQueue(){
		if(isEmpty()){
			System.out.print("Queue is Qeueu DounFlow");
			return null;
		}else{
			/* String data = arr[front];
			front++;
			if(front>rear){
				front=0;
				rear=-1;
			}
			return data; */
		
		
		 //method 2
		
		String data = arr[front];
		for(int i = 0;i<rear;i++){
			arr[i]=arr[i+1];
			
		}
		arr[rear--]="";
		return data; 
		}
		
	}
	
	public String peek(){
		if(isEmpty){}
	}
	
	
}

public class QueueADT{
	public static void main(String args[]){
		Queue queue = new Queue(5);
		//queue.isEmpty();//cheak the Qeueu is empty
		System.out.println(queue.isEmpty());
	//	queue.printQueue();//print the queue
		queue.enQueue("a");
		queue.enQueue("b");
		queue.enQueue("c");
		
		queue.printQueue();
		queue.deQueue();
		queue.printQueue();
		queue.printQueue();
		queue.printQueue();
		queue.enQueue("D");
		queue.enQueue("E");
	}
}