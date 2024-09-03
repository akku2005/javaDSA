package PatternPrinting;

import java.util.Scanner;

public class ReverseLetterTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (char ch = 'A'; ch <= 'A' + (num - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
