public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6) {};

        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();

        System.out.println("Circle: " + circleArea);
        System.out.println("Rectangle: " + rectangleArea);
    }
}