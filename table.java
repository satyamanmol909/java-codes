import java.util.Scanner;
public class table {
    public static void main(String[] args)
    {
        Scanner var1=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=var1.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"x"+i+"="+(num*i));
        }
        var1.close();
    }
    
}
