import java.util.ArrayList;
import java.util.Scanner;

public class MIssing {

    public static void findMisisng(ArrayList<Integer> arr){
  
        for(int i=1;i<arr.get(arr.size()-1);i++){
            if(arr.contains(i)){
                //System.out.println(3);
               continue;
            }else{
               // System.out.println(4);
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the size :");
        int size = sc.nextInt();

        for(int i=0;i<size;i++){
            int value=sc.nextInt();
            arr.add(value);
        }
    
        findMisisng(arr);

    }
}
