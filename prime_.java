import java.util.Scanner;
;
public class prime_ {
    public static void main(String[] args)
    {
        boolean isPrime = true;
        Scanner var1=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=var1.nextInt();
        if(num>2)
        {
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    System.out.println(num +" is not prime number");
                    isPrime = false;
                    break;
                }
            }
        }
        
        if(isPrime)
        {
            System.out.println(num+" is prime number");
        }
        var1.close();

    }
    
}
    

