import java.util.Scanner;
public class pattern1 
{
    public static void main(String [] args)
    {
        Scanner var1=new Scanner(System.in);
        System.out.println("enter the row number:");
        int num=var1.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        var1.close();

    }
    
}
