package PatternPrinting;

import java.util.Scanner;

public class HollowReverseTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int i, j, k;
        // outer loop
        for (i = n; i >= 1; i--) {
            // inner loop
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                // printing the starts
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
