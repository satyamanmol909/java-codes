import java.util.Scanner;
public class largest_of_three_number {
    public static void main(String[] args)
    {
        Scanner var1=new Scanner (System.in);
        System.out.print("enter the firs number:");
        double a=var1.nextDouble();
        System.out.print("enyter the second number:");
        double b=var1.nextDouble();
        System.out.print("enter the third number:");
        double c=var1.nextDouble();
        if(a>b&&a>c)
        {
            System.out.println(a+" is greatest number in the given three number");

        }
        else if(b>a&&b>c)
        {
            System.out.println(b+" is greatest in given three number");
        }
        else if(c>a&&c>b)
        {
            System.out.println(c+" is greatest in the given three number ");
        }
        var1.close();
    }
    
}
