import java.util.Scanner;
public class calculator
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter first number: ");
        int num1=sc.nextInt();
        System.out.print("enter second number: ");
        int num2=sc.nextInt();
        System.out.print("enter  operator (+,-,*,/): ");
        char operator=sc.next().charAt(0);
        if (operator=='+')
        {
            System.out.print("SUM OF "+num1+" and "+num2+"="+num1 + num2);
        }
        else if (operator=='-')
        {
            System.out.print("diffrence OF "+num1+" and "+num2+"="+(num1 -num2));
        }
        else if (operator=='*')
        {
            System.out.print("product OF "+num1+" and "+num2+"="+num1 *num2);
        }
        else if(operator=='/')
        {
            System.out.print("quoitent OF "+num1+" and "+num2+"="+num1 /num2);
        }
        sc.close();
    }
}