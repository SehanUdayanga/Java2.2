import java.util.Scanner;

class Array1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		
		
		String arr[] = sc.nextLine().split(" ");
		
		int iarr [] =new int [arr.length];
		
		for(int i=0;i<arr.length;i++){
			iarr[i]=Integer.parseInt(arr[i]);
		}
		
		for(int  a:iarr){
			System.out.println(a=a+1);
		}
	}
}
