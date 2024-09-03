package PatternPrinting;

import java.util.Scanner;

public class SymmetricVoidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number:");
        int num = sc.nextInt();

        int inis = 0;
        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("*");
            }
            // for printing the spaces in the row.
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }

            // for printing the stars in the row.
            for (int j = 1; j <= num - i; j++) {
                System.out.print("*");
            }
            inis += 2;
            System.out.println();

        }
        inis = 2 * num - 2;
        for (int i = 1; i <= num; i++) {

            // for printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // for printing the spaces in the row.
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }

            // for printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // The spaces decrease by 2 every time we hit a new row.
            inis -= 2;

            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();
        }
    }
}
