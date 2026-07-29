import java.util.*;
public class Frequncy {

    public static void frequancy(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            boolean check=false;

            for(int j=0;j<i;j++){
                if(arr.get(i)==arr.get(j)){
                    check=true;
                    break;
                }
            }

            if(check){
                continue;
            }

            int count=0;
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(i).equals(arr.get(j))){
                    count++;
                }
             }

          System.out.println(arr.get(i) + " count is " + count);
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

        frequancy(arr);

    }
}
