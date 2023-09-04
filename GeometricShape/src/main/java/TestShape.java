public class TestShape {
    
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle (6,7,4,5,6);
        Square square = new Square(6);
        
        triangle.displayInfo();
        System.out.println();
        square.displayInfo();
    }
}