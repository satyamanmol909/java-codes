import java.util.Scanner;

public class dimond {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("enter a row number:");
        int num = var1.nextInt();
        // upper
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        var1.close();

    }
}
