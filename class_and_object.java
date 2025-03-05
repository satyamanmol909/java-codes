class student
{
    String name;
    int roll;
    student(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
        System.out.print("name:"+name+"\nroll:"+roll);
    }
}
public class class_and_object 
{
    public static void main(String[] args)
    {
        student s=new student("satyam",1);
    }
}
