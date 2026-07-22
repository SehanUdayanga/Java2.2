class Uni{
	 public static void main(String args[]){
		 char [] arr = {'a','b','c'};
		 add(arr," ",0);
		 
	 }
	 
	 public static void add(char [] arr ,String combi,int i){
		 System.out.println(combi);
		 for(int x=i;x<arr.length;x++){
			 add(arr,combi+arr[x],x+1);
		 }
	 }
}