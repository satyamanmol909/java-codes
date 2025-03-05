import java.util.Scanner;

public class PrimeNumberInRange {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
