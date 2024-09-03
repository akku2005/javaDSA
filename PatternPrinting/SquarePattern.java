package PatternPrinting;

import java.util.Scanner;

public class SquarePattern {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        // outer loop
        for (int i = 0; i < num; i++) {
            // inner loop
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}