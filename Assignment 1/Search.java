import java.util.Scanner;

class Search{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size = sc.nextInt();
		
		int [] arr= new int[size];
		
		System.out.println("Enter "+size+" numbers");
		
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter number for search :");
		int value = sc.nextInt();
		int index = search(arr,value);
		System.out.println("Number found at index: " + index);
		sort(arr);
		
		System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
	
	public static int search(int []arr,int value){
		for(int i =0;i<arr.length;i++){
			if(arr[i]==value){
				return i;
			}
		}
		return -1;
	}
	
	 public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

	
}