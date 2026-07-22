class Sum{

    public static int sumR(int [] arr,int i,int result){
        if(i>=arr.length){
            return result;
        }
        return sumR(arr,i+1,result+arr[i]);
    }
    

    public static int sum(int arr []){
        int total=0;
        for(int val:arr){
            total+=val;
        }
        return total;
    }
    public static void main(String args[]){
        int [] arr = {5,2,3,4,2};
		long itarateStartTime = System.nanoTime();
        int total = sum(arr);
		System.out.println(total);
		long itarateEndTime = System.nanoTime();
		long exitatime = itarateEndTime-itarateStartTime;
		System.out.println("Itarate time is :"+exitatime);
        
		long recursiveStatTime = System.nanoTime();
        int totalr = sumR(arr,0,0);
        System.out.println(totalr);
		long recendtime = System.nanoTime();
		long exitatimer= recendtime-recursiveStatTime;
		System.out.println("The recursive end time is : "+exitatimer);
    }
}