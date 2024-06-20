package a5;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

class Interfa {
    public static void main(String[] args) {
        // Create a circle
        Circle c = new Circle(5);

        // Create a rectangle
        Rectangle r = new Rectangle(3, 4);

        // Calculate and print the areas
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
    }

    // Method to get the area of any shape implementing the Shape interface
    //public static double getArea(Shape shape) {
      // return shape.calculateArea();
    }


