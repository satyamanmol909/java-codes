import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) 
    {
        Scanner var2=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=var2.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*num);
        }
        var2.close();
    }
    
}
