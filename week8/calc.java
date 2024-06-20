
package Main;
// File: Calculator/MainCalculator.java
import calculator.Addition;
import calculator.Subtraction;
import calculator.Multiplication;
import calculator.Division;

public class calc {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        // Addition
        double sum = Addition.add(num1, num2);
        System.out.println("Sum: " + sum);

        // Subtraction
        double difference = Subtraction.subtract(num1, num2);
        System.out.println("Difference: " + difference);

        // Multiplication
        double product = Multiplication.multiply(num1, num2);
        System.out.println("Product: " + product);

        // Division
        double quotient = Division.divide(num1, num2);
        System.out.println("Quotient: " + quotient);
    }
}

