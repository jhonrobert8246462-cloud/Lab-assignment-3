// Abstract class Shape
abstract class Shape {
    // Abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Subclass Circle extends Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement abstract methods
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass Triangle extends Shape
class Triangle extends Shape {
    private double side1, side2, side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implement abstract methods
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;  // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Create Circle object
        Circle circle = new Circle(5.0);
        System.out.println("=== Circle ===");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Create Triangle object
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("\n=== Triangle ===");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
