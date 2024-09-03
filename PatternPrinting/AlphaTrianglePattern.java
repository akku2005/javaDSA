package PatternPrinting;

import java.util.Scanner;

public class AlphaTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            for (char ch = (char) (int) ('A' + num - 1 - i); ch <= (char) (int) ('A' + num - 1); ch++) {
                System.out.print(ch + "  ");
            }
            System.out.println();
        }
    }
}
