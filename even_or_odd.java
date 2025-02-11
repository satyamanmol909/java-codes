import java.util.Scanner;
public class even_or_odd {
    public static void main(String[] args)
    {
        Scanner var1=new Scanner(System.in);
        System.out.print("entyer a number:");
        int num=var1.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is even number");
        }
        else
        {
            System.out.println(num+" is odd number");
        }
        var1.close();
    }
    
}
