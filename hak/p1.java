import java.util.*;


public class p1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array Size : ");
      int size = sc.nextInt();
      int arr[] = new int[size];
      HashMap<Integer,Integer> map = new HashMap<>();
        
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
      }
      //1 2 3 5 2 

      for(int i=0;i<size;i++){
        int count=0;
        for(int j=0;j<size;j++){
          if(arr[i]==arr[j]){
            count = count+1;
           
          }
        }
        map.put(arr[i], count);

      
      }
      int maxFreq = 0;
int answer = Integer.MAX_VALUE;

for (int key : map.keySet()) {
    int freq = map.get(key);

    if (freq > maxFreq) {
        maxFreq = freq;
        answer = key;
    } else if (freq == maxFreq && key < answer) {
        answer = key;
    }
}

System.out.println(answer);
      


    }

}
