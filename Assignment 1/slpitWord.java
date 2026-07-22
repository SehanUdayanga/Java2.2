import java.util.Scanner;

class SlpitWord{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentencs :");
		String sen = sc.nextLine();
		
		String [] sword= sen.split(" ");
		
		for (String word:sword){
			for (int x =word.length()-1;0<=x;x--){
				System.out.print(word.charAt(x));
			}
			System.out.println("");
		}
		
	}
}