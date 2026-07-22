import java.util.Scanner;

class ArrayADT {
    int[] array;
    int size;
	
	//insertion sorting algorithm
	public void insertionSort(){
		for(int i=0;i<size;i++){
			int key=get(i);
			//System.out.print(temp);
			int j=i-1;
			
			
			while (j >= 0 && get(j) > key) {
				set(j + 1, get(j));
				j--;
			}
			set(j + 1, key);
			
			
		}
		traverse();
	}
	
	//two arrays are equal
	public void equal() {
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {1, 2, 3, 4, 5};

		if (arr1.length != arr2.length) {
			System.out.println("This is not equal");
			return;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				System.out.println("This is not equal");
				return;
			}else{
				System.out.println("This is  equal");
				return;
			}
		}
	}
 
	// remove duplicate elements from an array
	public void remDupli(){
		for(int i=0;i<getSize();i++){
			for(int j=i+1;j<getSize();j++){
				
				if(get(i)==get(j)){
					
					delete(j);
					j--;
					
					
				}
			}
		}
		traverse();
	}
	
	
	//number of occurrences of a given element in an array.
	public int occurrences(int target){
		int count=0;
		for(int a :array){
			
			if(target==a){
				count=count+1;
				
			}
		}
		if(count==0){
			System.out.println("Elemtn is not in the array");
			
		}
		return count;
	}

	
	//find the second largest number in an arraycopy
	public int secLarge(){
		int max=array[0];
		int temp=0;
		for(int i=1;i<getSize();i++){
			if(max<array[i]){
				temp=max;
				max=array[i];
			}
		}
		return temp;
	}
    
    public ArrayADT(int capacity) {
        array = new int[capacity];
        size = 0;
    }
    
	public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == array.length;
    }
	
	public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        return array[index];
    }
    
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        array[index] = value;
    }
    
    public int getSize() {
        return size;
    }
	
    public void insert(int index, int value) {		
        if (index < 0 || index > array.length-1) {
			System.out.println("Index is out of range");
            //throw new IndexOutOfBoundsException("Index is out of range");
        }
		else if(isFull()){
			System.out.println("Array is full");
		}		
		else{
			// Shift elements to the right to make space for the new value
			for (int i = size - 1; i >= index; i--) {
				array[i + 1] = array[i];
			}
			array[index] = value;
			size++;
			//System.out.println(value+ " inserted at "+ index);
		}        
    }

	public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
		else if(isEmpty()){
			System.out.println("Array is empty");
		}
		else{
			// Shift elements to the left to remove the element at the given index
			for (int i = index; i < size - 1; i++) {
				array[i] = array[i + 1];
			}
			array[size-1] = 0;
			size--;
		}
    }
    
    public int search(int value) {
		if(isEmpty()){
			System.out.println("Array is empty");
			return -1; 
		}
		else{
			for (int i = 0; i < size; i++) {
				if (array[i] == value) {
					return i;
				}
			}
			return -1;  // Value not found
		}        
    }
    
    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
	
	/*
	private void resizeArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    } */
	
    public static void main(String[] args) {
        ArrayADT arr = new ArrayADT(5);
        
        // Inserting elements
        arr.insert(0, 1);
        arr.insert(1, 1);
        arr.insert(2, 7);
        arr.insert(3, 2);
		arr.insert(4, 2);
		//arr.insert(4, 2);
		
		
		// Accessing and modifying elements
        //System.out.println("Element at index 2: " + arr.get(2));
        //arr.set(2, 9);
        //System.out.println("Modified element at index 2: " + arr.get(2));
        
        // Determining the size
      //  System.out.println("Size of the array: " + arr.getSize());
        
        // Deleting an element
	//	arr.delete(1);
      //  System.out.println("Size after deleting an element: " + arr.getSize());
		        
        // Searching for an element
      //  int index = arr.search(7);
       // System.out.println("Index of element 7: " + index);
        
		
		
		
		
        // Traversing the array
        arr.traverse();     

		
		
		//find the second large element in the array
		System.out.println("The second ragest value is "+arr.secLarge());
		
		//number of occurrences of a given element in an array.
		System.out.print("Enter the elemt that need the count :");
		Scanner sc = new Scanner(System.in);
		int element=sc.nextInt();
		System.out.println("The count  of "+element+" is "+arr.occurrences(element));
		
		
		// remove duplicate elements from an array
		arr.remDupli();
		
		
		//two arrays are equal
		System.out.println("first array: 1, 2, 3, 4, 5");
		
		System.out.println("second array :1, 2, 3, 4, 5");
		arr.equal();
		
		
		//insertion sorting algorithm
		System.out.print("After the remove duplicate value The sorted arrey is :");
		arr.insertionSort();
		
    }
}