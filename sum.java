import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        
        Scanner var1 = new Scanner(System.in);
        System.out.print("enter the number:");
        double x=var1.nextDouble();
        System.out.print("enter the second number:");
        double y=var1.nextDouble();
        double sum=x+y;
        System.out.println("sum="+sum);
        
        var1.close();

    }
    
}
