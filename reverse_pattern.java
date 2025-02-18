import java.util.Scanner;
public class reverse_pattern {
    public static void main(String [] args)
    {
        Scanner var1=new Scanner(System.in);
        System.out.print("enter the row number:");
        int num=var1.nextInt();
        for(int i=0;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        var1.close();
    }
    
}
