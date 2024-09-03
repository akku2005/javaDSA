public class NumberCrownPattern {
    public static void main(String[] args) {
        int n = 6; // Number of rows

        // Upper half of the crown
        for (int i = 1; i <= n; i++) {
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
