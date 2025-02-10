import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args){
        Scanner var1=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=var1.nextInt();
        int sum=0;
        int realnumber=num;
        while(num>0)
        {
            
                int digit = num % 10;
                sum =sum + digit;
                num=num/ 10;
        }
        System.out.println("sum of "+ realnumber +"= "+sum);
        var1.close();
    }

    
}
