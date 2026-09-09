import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();

       
        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.push(30);
        stack.push(20);
        stack.push(40);

        System.out.println("Original Stack: " + stack);

        while (!stack.isEmpty()) {
            int value = stack.pop();

            if (!temp.contains(value)) {
                temp.push(value);
            }
        }

        
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        System.out.println("Stack after removing duplicates: " + stack);
    }
}