import java.util.Scanner;
import java.util.Stack;
class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}


class StackLinkedListADT<T> {

    Node<T> top;

    public StackLinkedListADT() {
        top = null;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // push
    public void push(T data) {

        Node<T> newNode = new Node<T>(data);

        if (isEmpty()) {
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
    }

    // pop
    public T pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }

        T data = top.data;
        top = top.next;

        return data;
    }

    // peek
    public T peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }

        return top.data;
    }

    // traversal
    public void traversal() {

        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        Node<T> current = top;

        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}


public class palindrome{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = sc.nextLine().toLowerCase();
		StackLinkedListADT<Character> stack =new StackLinkedListADT<>();

		for(int i=0;i<word.length();i++){
			stack.push(word.charAt(i));
			
		}
		System.out.println("The palindrome value");
		String finalWord="";

		while (!stack.isEmpty()) {
			
			finalWord =finalWord+ stack.pop();
		}
		System.out.println(finalWord);
		
		if(word.equals(finalWord)){
			System.out.println("This is Palindrome");
		}else{
			System.out.println("This is  Not Palindrome");
		}

		


	}
}