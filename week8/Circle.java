// Circle.java
package shapes;

// Circle class implementing the Shape interface
public class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the calculateArea method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

