import java.util.Scanner;

class Fibonacci {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fibonacci value need :");
		int value = sc.nextInt();
		
		for(int x=0;x<=value;x++){
			int tot = fib(x);
			System.out.print(tot+" ");
		}
		
	}
	
	public static int fib(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
}