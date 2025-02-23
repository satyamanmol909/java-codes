import java.util.Scanner;
public class total_even 
{
    public static void main(String []args)
    {
        Scanner var1=new Scanner(System.in);
        System.out.print("enter the last number:");
        int num=var1.nextInt();
        System.out.println("even numbers between 1 and "+num);
        for(int i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        var1.close();

    }
    
}
