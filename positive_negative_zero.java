import java.util.Scanner;
public class positive_negative_zero
{
    public static void main(String [] args)
    {
        Scanner anmol=new Scanner(System.in);
        System.out.print("enter the number:");
        double num=anmol.nextDouble();
        if(num>0)
        {
            System.out.println(num+ " is positive number");
            
        }
        else if(num<0)
        {
            System.out.println(num+ " is negative number");
        }
        else
        {
            System.out.println(num+ "is zero");
        }
        anmol.close();

    }
}
