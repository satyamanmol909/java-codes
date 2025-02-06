import java.util.Scanner;  // Import the Scanner class to take input

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();  // Read first number

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();  // Read second number

        // Perform addition
        double result = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + result);
        
        // Close the scanner
        input.close();
    }
}
