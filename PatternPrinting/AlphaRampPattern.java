package PatternPrinting;

import java.util.Scanner;

public class AlphaRampPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (int) ('A' + i) + " ");
            }
            System.out.println();
        }
    }
}
