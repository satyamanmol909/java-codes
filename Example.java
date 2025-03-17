import java.util.Scanner;

class Example {

    void hello1() {
        System.out.println("Hello 1");
    }

    void hello2(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" (" + i + ") Hello");
        }
    }

    int sum1() {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        return a + b;
    }

    int sum2(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println("Harshit");

        Example e1 = new Example();

        e1.hello1();
        e1.hello2(3);

        int result = e1.sum1();
        System.out.println("Result sum1: " + result);

        int result2 = e1.sum2(4, 7);
        System.out.println("Result sum2: " + result2);
    }
}