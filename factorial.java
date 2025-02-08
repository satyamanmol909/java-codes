import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        int fab=1;
        Scanner var1=new Scanner(System.in);
        System.out.println("enter the last term:");
        int a=var1.nextInt();
        for(int i=1;i<=a;i++)
        {
             fab=fab*i;
        }
        System.out.println("factorial of "+a+"="+fab);
        var1.close();
    }
    
}
