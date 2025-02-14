import java.util.Scanner;
public class prime_no 
{
    public static void main(String[] args)
    {
        Scanner var2=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=var2.nextInt();
        int i;
        if(num>1)
        {
            for(i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    break;
                }
            }
            if(i==num)
            {
                System.out.println(num+" is prime number");
            }
            else
            {
                System.out.println(num+" is not prime number");
            }
        }
        else
        {
            System.out.println(num+" is not prime number");
        }
        var2.close();   
    }  
}
