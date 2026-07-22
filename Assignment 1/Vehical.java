 class Vehical{

    private String model;
    private int year;

    Vehical(String model,int year){
        this.model=model;
        this.year=year;
    }

    public void setModel(String model){
        this.model=model;
    }

    public String getModel(){
        return model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return this.year;
    }
}

 class Car extends Vehical{
    private int doors;

    Car(String model,int year,int doors){
        super(model,year);
        this.doors=doors;
    }
    public void setDoors(int doors){
        this.doors=doors;
    }
    public int getDoors(){
        return this.doors;
    }

}

 class Motorcycle extends Vehical{
    private double wheelsize;

    public Motorcycle(String model,int year,double wheelsize){
        super(model,year);
        this.wheelsize=wheelsize;
    }

    public void setWheelSize(double wheelsize){
        this.wheelsize=wheelsize;

    }
    public double getWheelSize(){
        return this.wheelsize;
    }
}


 class TestVehical{
    public static void main(String args[]){
       Car car = new Car("Toyota",2020,4);
       System.out.println("Car Model: "+car.getModel());
       System.out.println("Car Year: "+car.getYear());
       System.out.println("Car Doors: "+car.getDoors());

       Motorcycle m1 = new Motorcycle("Harley Davidson",2019,18.5);
       System.out.println("Motorcycle Model: "+m1.getModel());
       System.out.println("Motorcycle Year: "+m1.getYear());
       System.out.println("Motorcycle Wheel Size: "+m1.getWheelSize());

    }
}