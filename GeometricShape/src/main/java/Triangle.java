public class Triangle implements GeometricShape {
    
    private double height;
    private double base;
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(double height, double base, double side1, double side2, double side3) {
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculateArea() {
return 0.5 * height * base;
}

    @Override
    public double calculatePerimeter() {
return side1 + side2 + side3;
}

    @Override
    public void displayInfo() {
System.out.println("Area of Triangle: " + calculateArea());
System.out.println("Perimeter of Triangle: " + calculatePerimeter());
}
}