import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("enter the row number: ");
        int row = var1.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        var1.close();
    }

}
