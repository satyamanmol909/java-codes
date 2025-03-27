class base // base class
{
    // data of student
    String name = "satyam anmol";
    static int roll = 5;

    static void add() {
        System.out.println("hello");
    }

    public void information() {
        System.out.println("hello. i am second student");
    }

}

class ram extends base //
{
    public static void main(String[] args) {

        ram r = new ram();
        r.information();
        add();
        r.name = "raj";
        System.out.println(r.name);
        System.out.println(roll);

    }
}