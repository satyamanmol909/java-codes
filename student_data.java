import java.util.Scanner;

public class student_data
/* student data */

{
    static Scanner var2 = new Scanner(System.in);
    int roll;
    int std;
    String name;

    public void input() {
        System.out.print("enter the name:");
        name = var2.nextLine();
        System.out.print("enter the roll:");
        roll = var2.nextInt();
        System.out.print("enter the class:");
        std = var2.nextInt();
    }

    public void out() {
        System.out.println("NAME=" + name);
        System.out.println("ROLL=" + roll);
        System.out.println("class=" + std);
    }

    public static void main(String[] args) {
        student_data f2 = new student_data();
        f2.input();
        f2.out();

    }

}
