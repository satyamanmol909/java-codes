import java.util.Scanner;

class DDA {
    public static void main(String[] args) {
        int x1, y1, x2, y2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point (x1, y1):");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();

        System.out.println("Enter the coordinates of the second point (x2, y2):");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        scanner.close();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double steps = Math.max(Math.abs(dx), Math.abs(dy));

        double xInc = dx / steps;
        double yInc = dy / steps;

        double x = x1;
        double y = y1;

        while (x <= x2) {
            System.out.println("(" + (int) x + ", " + (int) y + ")");
            x += xInc;
            y += yInc;
        }
    }
}
