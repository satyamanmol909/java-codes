import java.util.Scanner;
public class even_or_odd {
    
    public static void main(String[] args){
        Scanner var1=new Scanner(System.in);
        System.out.print("enter a number:");
        int x=var1.nextInt();
        
        if(x%2==0){
        System.out.println(x+" is even number");
        }
        else
        {
        System.out.println(x+" is odd number");
        }
        var1.close();


    }
    
}
