public class Square implements GeometricShape {
    
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        return side * side;
    }
    
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Area of Square: " + calculateArea());
        System.out.println("Perimeter of Square: " + calculatePerimeter());
        
    }
}