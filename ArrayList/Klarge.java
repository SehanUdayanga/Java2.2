import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Klarge {




    public static  void sortA(ArrayList<Integer> arr){

        arr.sort(Collections.reverseOrder());
         
    }

    public static int  getKvalue(ArrayList<Integer> arr,int k){
        if(arr.isEmpty() || arr.size()<k | k<=0){
            return -1;
        }else{
            return arr.get(k-1);
        }

        
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

       

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter  the values :");

        for(int i=0;i<n;i++){
            int valu =sc.nextInt();
            arr.add(valu);
        }

        System.out.println("Enter valu that you want to find :");
        int k  = sc.nextInt();

       

        // System.out.println("sorted array is : ");
        sortA(arr);

        // for (Integer a: sortedList) {
        //     System.out.print(a+" ");
        // }

        
        
        int kval = getKvalue(arr,k);


        System.out.println(kval);

    }

}
