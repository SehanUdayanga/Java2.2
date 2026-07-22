import java.util.Scanner;

class Multiple{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The multiple Time : ");
		int value = sc.nextInt();
		
		
		for(int x=1;x<=10;x++){
			System.out.println(value+"x"+x+" = "+value*x);
		}
		
	}
}