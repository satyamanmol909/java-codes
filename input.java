import java.util.Scanner;
public class input {
    public static void main(String[] args)
    {
        Scanner object=new Scanner(System.in);
        System.out.print("enter the name:");
        String name=object.nextLine();
        System.out.print("enter the age:");
        int age=object.nextInt();
        System.out.println("NAME="+name);
        System.out.println("AGE="+age);
    

        object.close();
    }
    
}
