public class patternSquare {
    public static void main(String[] args) {
        int num = 1;
        int odd = 1;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 1) { // Odd rows
                num = odd;
                for (int j = 1; j <= 5; j++) {
                    System.out.print(" " + num);
                    num++;
                }
                odd = num; // Update odd to start the next row
            } else { // Even rows
                int temp = odd + 4;
                for (int k = 5; k >= 1; k--) {
                    System.out.print(" " + temp);
                    temp--;
                }
                odd = temp + 6; // Update odd to handle next even row
            }
            System.out.println();
        }
    }
}
