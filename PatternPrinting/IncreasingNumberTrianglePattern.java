package PatternPrinting;

import java.util.Scanner;

public class IncreasingNumberTrianglePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int start = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = start + 1;
            }
            System.out.println();
        }
    }
}