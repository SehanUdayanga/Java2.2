class test {
    public static void main(String[] args) {
        
        String [] car={"car1","car2","car3"};
        car[0]="a";

        String [] a = new String[3];
        a[0]="a";
        

        System.out.println(a[0]);

        for(String cars:car){
            System.out.println(cars);

        }

        int [][] num ={{1,2,3},{4,5,6}};
        num[1][0]=10;

        System.out.println(num[1][1]);

        for(int[] row:num){
            for(int col:row){
                System.out.print(col+ " " );

            }
            System.out.println("");
        }
    }
}