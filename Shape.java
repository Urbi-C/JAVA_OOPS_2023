import java.lang.Math;

// Point class representing a 2D point
class Point {
    private double x;
    private double y;

    // Constructor to initialize the coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate the distance between two points
    public double calculateDistance(Point otherPoint) {
        double deltaX = this.x - otherPoint.x;
        double deltaY = this.y - otherPoint.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

// Abstract Shape class
abstract class Shape {
    // Abstract methods
    public abstract double area();
    public abstract double perimeter();
    public abstract String colour();
    public abstract String compareShape(Shape ob);
}

// Derived class Triangle
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Overridden methods
    @Override
    public double area() {
        // Implementation of area calculation for a triangle
        // (Assuming it's a valid triangle)
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public String colour() {
        return "No specific colour";  // You can provide the actual colour implementation
    }
    @Override
    public String compareShape(Shape ob) {
        // Implementation of comparing two Triangle objects
        if (ob instanceof Triangle) {
            Triangle otherTriangle = (Triangle) ob;
            if (this.area() == otherTriangle.area() && this.perimeter() == otherTriangle.perimeter()) {
                return "Matching Triangles";
            } else {
                return "Non-matching Triangles";
            }
        } else {
            return "Shapes are not of the same type";
        }
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overridden methods
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String colour() {
        return "No specific colour";  // You can provide the actual colour implementation
    }

    @Override
    public String compareShape(Shape ob) {
        // Implementation of comparing two Rectangle objects
        if (ob instanceof Rectangle) {
            Rectangle otherRectangle = (Rectangle) ob;
            if (this.area() == otherRectangle.area() && this.perimeter() == otherRectangle.perimeter()) {
                return "Matching Rectangles";
            } else {
                return "Non-matching Rectangles";
            }
        } else {
            return "Shapes are not of the same type";
        }
    }
}

// Derived class Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden methods
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String colour() {
        return "No specific colour";  // You can provide the actual colour implementation
    }

    @Override
    public String compareShape(Shape ob) {
        // Implementation of comparing two Circle objects
        if (ob instanceof Circle) {
            Circle otherCircle = (Circle) ob;
            if (this.area() == otherCircle.area() && this.perimeter() == otherCircle.perimeter()) {
                return "Matching Circles";
            } else {
                return "Non-matching Circles";
            }
        } else {
            return "Shapes are not of the same type";
        }
    }
}



