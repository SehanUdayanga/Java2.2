import java.util.*;

class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size that arry size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        int min =arr[0];
        for(int x=1;x<size;x++){
            if(arr[x]<min){
                min=arr[x];
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}