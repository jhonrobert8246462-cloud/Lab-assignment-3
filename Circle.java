// Drawable.java
interface Drawable {
    void draw();
}

// Circle.java
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle:");
        System.out.println("   ***   ");
        System.out.println(" *     * ");
        System.out.println("*       *");
        System.out.println(" *     * ");
        System.out.println("   ***   ");
        System.out.println();
    }
}

// Rectangle.java
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle:");
        System.out.println("**********");
        System.out.println("*        *");
        System.out.println("*        *");
        System.out.println("**********");
        System.out.println();
    }
}

// Triangle.java
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle:");
        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" ******** ");
        System.out.println();
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Drawable[] shapes = { new Circle(), new Rectangle(), new Triangle() };

        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}


