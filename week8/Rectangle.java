// Rectangle.java
package shapes;

// Rectangle class implementing the Shape interface
public class Rectangle implements Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementing the calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }
}

