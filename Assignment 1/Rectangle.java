class Rectangle{
    private double width;
    private double height;

    Rectangle(double width,double height){
        this.width = width;
        this.height = height;

    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getParimeter(){
        return 2 * (width + height);
    }

    public double getArea(){
        return width * height;
    }

}
class RectangleTest {
    public static void main(String args[]){
        Rectangle rect = new Rectangle(5.0, 10.0);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Perimeter: " + rect.getParimeter());
        System.out.println("Area: " + rect.getArea());
    }
}