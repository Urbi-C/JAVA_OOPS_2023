// Main class to test the code
public class ShapeDemo {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(5, 12, 13);

        Triangle triangle3 = new Triangle(3, 4, 5);
        Triangle triangle4 = new Triangle(3, 4, 5);

        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(6, 8);

        Rectangle rectangle3 = new Rectangle(4, 5);
        Rectangle rectangle4 = new Rectangle(4, 5);

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(5);
        Circle circle4 = new Circle(5);
        // Testing the compareShape method using dynamic method dispatch
        System.out.println("Comparison Results:");

        System.out.println(triangle1.compareShape(triangle2));
        System.out.println(triangle3.compareShape(triangle4));
        System.out.println(rectangle1.compareShape(rectangle2));
        System.out.println(rectangle3.compareShape(rectangle4));
        System.out.println(circle1.compareShape(circle2));
        System.out.println(circle3.compareShape(circle4));
    }
}
