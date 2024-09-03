package PatternPrinting;

import java.util.Scanner;

public class NumberTrianglePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        // outer loop
        for (int i = 1; i <= num; i++) {
            // inner loop
            for (int j = 1; j < num - i; j++) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}