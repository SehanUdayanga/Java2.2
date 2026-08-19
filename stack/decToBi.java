import java.util.Scanner;
class Stack{
	int top;
	int maxSize ;
	int arr[];
	
	public Stack(int maxSize){
		this.maxSize=maxSize;
		this.arr =new int [maxSize];
		this.top=-1;
	}
	
	public boolean isEmpty(){
		return top ==-1;
	}
	public boolean isFull(){
		return top==maxSize-1;
	}
	
	public void push(int data){
		
		if(isFull()){
			System.out.println("Stack overflow");
		}else{
			arr[++top]=data;
		}
		
	}
	
	public int  pop(){
		if(isEmpty()){
			return -1;
		}else{
			return arr[top--];
		}
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("stack is empty");
			return -1;
		}else{
			return arr[top];
		}
	}
	
	public void display(){
		
		if(isEmpty()){
			System.out.print("Stack is empty ");
		}else{
			for(int i=top;i>=0;i--){
				System.out.print(arr[i] + " ");
			}
		}
		
	}
	
	
	
}

public class decToBi {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        int value=10;

        while(value==0){
            int remain = value%2;
            System.out.println(remain);
            value=value/2;
            System.out.println(value);
        }
    }
}