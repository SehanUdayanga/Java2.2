import java.util.*;

class Arrli{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        al.add(4);
        al.add(5);
        al.add(6);
        System.out.println(al.size());
		
		for(int a:al){
			System.out.println(a);
		}
    }
}