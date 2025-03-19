import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("enter the row number:");
        int row = var1.nextInt();
        int i;
        for (i = 1; i <= row; i++) {
            for (int k = i; k <= row; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        var1.close();
    }
}
