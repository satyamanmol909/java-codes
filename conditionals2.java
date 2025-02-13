import java.util.Scanner;
public class conditionals2 {
    public static void main(String[] args)
    {
        Scanner var2= new Scanner(System.in);
        System.out.print("enter a name:");
        String name=var2.nextLine();
        System.out.print("enter the gender (M/F):");
        char gender=var2.next().charAt(0);
        System.out.print("enyter the age:");
        int age=var2.nextInt();
        System.out.print("person is marriged or not(m/n)");
        char mar=var2.next().charAt(0);
        if(gender=='M')
        {
            if(age>=21)
            {
                if(mar=='m')
                {
                    System.out.println(name+" is able for licence");
                    System.out.println("pay 2500");
                }
                else
                {
                    System.out.println(name+" able for licence");
                    System.out.println("pay 4000");
                }
            }
            else
            {
                System.out.println(name+" is not able for licence");
            }
        }
        else
        {
            if(age>=18)
            {
                if(mar=='m')
                {
                    System.out.println(name+" is able for licence");
                    System.out.println("pay 1800");
                }
                else
                {
                    System.out.println(name+" is able for licence");
                    System.out.println("pay 2000");
                }
            }
            else
            {
                System.out.println(name+" is not able for licence");
            }
        }
        var2.close();

    }
    
}
