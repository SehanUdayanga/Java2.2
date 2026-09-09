import java.util.LinkedList;

public class CompareSentences {
    public static void main(String[] args) {

        LinkedList<String> sentence1 = new LinkedList<>();
        LinkedList<String> sentence2 = new LinkedList<>();

        sentence1.add("I");
        sentence1.add("Love");
        sentence1.add("Java");

        sentence2.add("i");
        sentence2.add("love");
        sentence2.add("java");

        boolean equal = true;

        if (sentence1.size() != sentence2.size()) {
            equal = false;
        } else {
            for (int i = 0; i < sentence1.size(); i++) {

                if (!sentence1.get(i).equalsIgnoreCase(sentence2.get(i))) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal) {
            System.out.println("Sentences are equal.");
        } else {
            System.out.println("Sentences are not equal.");
        }
    }
}