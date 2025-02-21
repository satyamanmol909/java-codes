import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner var1=new Scanner(System.in);
        

        System.out.println("enter the number:");
        int number=var1.nextInt();

        String result=(number % 2 == 0) ? "even":"odd";
        System.out.println(result);
        var1.close();
    }
}
