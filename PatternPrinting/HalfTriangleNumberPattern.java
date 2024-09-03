package PatternPrinting;

import java.util.Scanner;

public class HalfTriangleNumberPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number:");
        int numb = sc.nextInt();

        // outer loop
        for (int i = 0; i <= numb; i++) {
            // inner loop
            for (int j = 0; j <= numb; i++) {
                System.out.print("");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i + "");
            }
            System.out.println("");
        }
    }
}
