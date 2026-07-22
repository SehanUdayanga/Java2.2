class ArrayA{
	
	int [] array;
	int size;
	
	public int size(){
		return size;
	}
	public int get(int index){
		if(size<0 || index>size){
			System.out.println("Enter valid index");
		}
		return array[index];
	}
	
	public void travesel(){
		for(int element:array){
			System.out.print(element+" ");
		}
		
	}
	public void set(int index,int val){
		if(size<0){
			System.out.println("Array out of bound ");
		}
		array[index]=val;
		size++;
	}
	
	public ArrayA(int capacity){
		array = new int[capacity];
		size=size+1;
		
	}
	public boolean isEmpty(){
		return size==0;
	}
	
	public boolean isFull(){
		return size ==array.length;
	}
	
	
	
	public static void main (String args[]){
		ArrayA array = new ArrayA(5);
		
		array.set(0,1);
		array.set(2,2);
		array.set(4,4);
		array.travesel();
		System.out.println("");
		array.set(0,8);
		array.travesel();
		System.out.println(array.size);
		System.out.println(array.get(2));
	}
}