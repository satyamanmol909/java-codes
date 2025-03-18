import java.util.Scanner;

public class newrectangle {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the row number:");
        int row = sc1.nextInt();

        System.out.print("Enter the column number:");
        int colum = sc1.nextInt();
        int i;

        for (i = 1; i <= row; i++)

        {
            for (int j = 1; j <= colum; j++) {
                if (i == 1 || j == 1 || i == row || j == colum) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc1.close();

    }
}