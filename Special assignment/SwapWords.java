import java.util.LinkedList;

public class SwapWords {
    public static void main(String[] args) {

        LinkedList<String> sentence = new LinkedList<>();

        sentence.add("I");
        sentence.add("love");
        sentence.add("Java");
        sentence.add("programming");

        System.out.println("Original sentence: " + sentence);

        
        int index1 = sentence.indexOf("love");
        int index2 = sentence.indexOf("Java");

        String temp = sentence.get(index1);
        sentence.set(index1, sentence.get(index2));
        sentence.set(index2, temp);

        System.out.println("New sentence: " + sentence);
    }
}