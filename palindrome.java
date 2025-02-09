import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner var1=new Scanner(System.in);
        System.out.print("Enter a data to check:");
        String num=var1.nextLine();
        String NEW="";
        for(char ch:num.toCharArray())
        {
            NEW=ch+NEW;
        }
        System.out.print(num.equals(NEW)? num+" is palindrome.":num+" is not palindrome ");
        
        var1.close();
      
        

    }
    
}
