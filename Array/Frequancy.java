import java.util.*;

class Frequancy{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size =sc.nextInt();
        int arr[]=new int[size];
        
        

        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<size;i++){
             boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }
            int count=0;
            for(int x=0;x<size;x++){
                if(arr[i]==arr[x]){

                    count=count+1;
                }
            }

            System.out.println(arr[i]+" coint is "+count);
        }

    }
}