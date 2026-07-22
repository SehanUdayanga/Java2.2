class test{
	public static void main(String args[]){
		//String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		//for(int i =0;i<cars.length;i++){
		//	System.out.println(cars[i]);
		//}
		
		//for(String car:cars){
		//	System.out.println(car);
		//}
		
		int[][] num = { {1, 4, 2}, {3, 6, 8, 5, 2} };
		
		
		
		for(int row =0;num.length>row;row++){
			for(int col=0;num[row].length>col;col++){
				System.out.print(num[row][col]);
			}
			System.out.println("");
		}
		
	}
}