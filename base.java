public class base {
    int roll = 1;
    int std = 3;
    String name = "satyam";

}

class derived extends base {
    public void out() {
        System.out.println("NAME=" + name);
        System.out.println("ROLL=" + roll);
        System.out.println("class=" + std);
    }

    public static void main(String args[]) {
        derived d = new derived();
        d.out();
    }
}
