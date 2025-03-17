import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("enter the row:");
        int row = var1.nextInt();

        for (int i = 1; i <= row; i++) // for row
        {

            for (int j = 1; j <= i; j++) // for coloum
            {
                System.out.print(j);
            }
            System.out.println();

        }
        var1.close();
    }

}
