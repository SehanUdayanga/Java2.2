import java.util.*;

public class Bubblesort {
    
    public static int [] mkArr(int [] a){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        return a;
    }
    public static int [] ASort( int arr []){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[i+1];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the size : ");
       int size = sc.nextInt();
       int arr[] = new int[size];

       arr=mkArr(arr);
       int result []=ASort(arr);

       for (int i : result) {
        System.out.print(i+ " ");
       }
    }
}
