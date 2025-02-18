import java.util.Scanner;

public class TrianglePattern 
{
    public static void main(String[] args) 
    {
        Scanner var1 = new Scanner(System.in);
        System.out.print("ENTER THE ROW OF THE TRIANGLE:");
        int num = var1.nextInt();

        for (int i = 1; i <= num; i++) 
        {
            for (int j = 0; j < num - i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        var1.close();
    }
}

    
