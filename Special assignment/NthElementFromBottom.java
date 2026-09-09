import java.util.Stack;

public class NthElementFromBottom {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int n = 3;  

        Stack<Integer> temp = new Stack<>();
        temp.addAll(stack);


        for (int i = 1; i < n; i++) {
            temp.remove(0);
        }

        int result = temp.get(0);

        System.out.println("Stack: " + stack);
        System.out.println(n + "th element from bottom: " + result);
    }
}