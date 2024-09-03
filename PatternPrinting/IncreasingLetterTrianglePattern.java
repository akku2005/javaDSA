package PatternPrinting;

import java.util.Scanner;

public class IncreasingLetterTrianglePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + "  ");

            }
            System.out.println();
        }
    }
}