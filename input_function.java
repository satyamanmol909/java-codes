import java.util.Scanner;
public class input_function {
    static Scanner var1=new Scanner(System.in);
    static int add()
    {
        System.out.print("enter the first number:");
        int a=var1.nextInt();
        System.out.print("enter the second  number:");
        int b=var1.nextInt();
        return a+b;
    }


    public static void main(String [] args)
    {
        System.out.println("sum="+add());
    }
    
}
