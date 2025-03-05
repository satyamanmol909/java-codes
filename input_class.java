import java.util.*;
class student
{
    public void output()
    {
        Scanner var1=new Scanner(System.in);
        System.out.print("enter the name:");
        String name=var1.nextLine();
        System.out.println("name="+ name);
        var1.close();
    }
}
public class input_class {
    public static void main(String[] args) {
        student sd=new student();
        sd.output();

    }
    
}
