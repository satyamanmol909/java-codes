import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("enter the row number:");
        int n = var1.nextInt();
        int a = n;
        int i;
        for (i = 1; i <= n; i++) {
            for (int j = a; j > 1; j--)// space
            {
                System.out.print(" ");
            }
            for (int k = i; k != 0; k--) {
                System.out.print(k);
            }
            a--;
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
            var1.close();
        }

    }
}
