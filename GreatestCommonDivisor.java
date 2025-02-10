import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int a = scanner.nextInt();
        System.out.print("Enter the second number:");
        int b = scanner.nextInt();

        int smaller = (a < b) ? a : b;
        int gcd = 1;

        for (int i = smaller; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }

        System.out.println("The greatest common divisor is: " + gcd);
        scanner.close();
    }
}
