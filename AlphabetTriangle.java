import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS: ");
        int num = scanner.nextInt();

        char alphabet = 'A'; 

        for (int i = 1; i <= num; i++) 
        {
            for (int j = 0; j < num - i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) 
            {
                System.out.print(alphabet);
                alphabet = (alphabet == 'Z') ? 'A' : (char)(alphabet + 1);
            }
            System.out.println();
        }

        scanner.close();
    }
}
