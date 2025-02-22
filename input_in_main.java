import java.util.Scanner;
public class input_in_main
{
    static int a=0;
    static  int b=0;
    static int add()
    {
        return a+b;
    }
    
    public static void main(String[] args)
    {
        Scanner var2=new Scanner(System.in);
        System.out.print("enter the number:");
        a=var2.nextInt();
         System.out.print("enter the number:");
        b=var2.nextInt();
        System.out.print("sum="+add());
        var2.close();
    }
}