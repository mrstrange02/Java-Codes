abstract class Shape {
    abstract double getArea();
    abstract double getCircumference();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getCircumference() {
        return 2 * (length + width);
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getCircumference() {
        return 4 * side;
    }
}

public class circlepoly {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

        displayShapeDetails(circle);
        displayShapeDetails(rectangle);
        displayShapeDetails(square);
    }

    static void displayShapeDetails(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Circle - Area: " + shape.getArea() + ", Circumference: " + shape.getCircumference());
        } else if (shape instanceof Rectangle) {
            System.out.println("Rectangle - Area: " + shape.getArea() + ", Circumference: " + shape.getCircumference());
        } else if (shape instanceof Square) {
            System.out.println("Square - Area: " + shape.getArea() + ", Circumference: " + shape.getCircumference());
        } else {
            System.out.println("Unknown shape");
        }
    }
}

