import java.util.Scanner;

public class lengths {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the length of the string
        int length = calculateStringLength(userInput);

        // Print the length of the string
        System.out.println("The length of the string is: " + length);
    }

    // Method to calculate the length of a string
    private static int calculateStringLength(String inputString) {
        return inputString.length();
    }
}

