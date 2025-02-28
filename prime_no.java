import java.util.Scanner;
public class prime_no {
    public static void main(String[] args)
    {
        Scanner var2=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        int num=var2.nextInt();
        if(num>2)
        {
            for(int i=2;i<=num;i++)
            {
                if(num%i==0)
                {
                    System.out.println(num+" is not prime number");
                    break;
                }
                else{
                    System.out.println(num+" is prime number");
                    break;
                }
            }
        }
        else
        {
            System.out.println(num+ " is prime number");
        }
        var2.close();
        
    }
    
}
