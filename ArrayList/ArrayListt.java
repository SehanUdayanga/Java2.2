import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListt {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Banan");
        list.add("Apple");
        list.add("Mango");
        list.set(0,"Guava");
        list.get(2);
        list.
        System.out.println(list.size());
        
        for (String a : list) {
            System.out.println(a);
        }
        arr();
    }

    public static void  arr(){
        Scanner sc= new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<String>();
        System.out.print("Enter trh size :");
        int size=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<size;i++){
            String food = sc.nextLine();
            foods.add(food);
        }

    }
}