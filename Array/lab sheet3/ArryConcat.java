import java.util.Scanner;
import java.util.Arrays;
public class ArryConcat {
   
    public static int [] addToArr(int [] a){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        return a;
    }

    public static void printArr(int [] arr){
        for(int a :arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static int [] concatArr(int arr1[],int arr2[]){
        int arr3[] = new int[arr1.length+arr2.length]; 

        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
         for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }

        return arr3;
    }

   

     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter fiest arr size :");
        int size1=sc.nextInt();
        int arr1 [] = new int[size1];
        arr1 =addToArr(arr1);
        printArr(arr1);
        System.out.println("Enter second arry size :");
        int size2=sc.nextInt();
        int arr2 [] = new int[size2];
        arr2 = addToArr(arr2);
        printArr(arr2);
        
        int arr3[] = concatArr(arr1,arr2);
        printArr(arr3);
        Arrays.sort(arr3);
        printArr(arr3);
    }
}
