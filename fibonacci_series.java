import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter the last term:");
        int num = var1.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(a);
            int temp = a;  
            a = b;         
            b = temp + b;  
        }
        System.out.println("The last term value = " + a);
        var1.close();
    }
}

