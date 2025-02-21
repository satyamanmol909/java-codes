public class function
{
   static void sum(int a,int b)
    {
        System.out.println("sum="+(a+b));
    }
    static void print()
    {
        System.out.println("default function");
    }
    static double add(double c,double d)
    {
        return c+d;
    }
    public static void main(String []args)
    {
        sum(5,6);

        System.out.println();
       System.out.println("sum="+add(5,6)); 
    }
}