package PatternPrinting;

import java.util.Scanner;

public class ZeroOneBinaryNUmberPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number:");
        int num = sc.nextInt();

        int stars = 1;
        // outer loop
        for (int i = 0; i <= num; i++) {
            // yaha hum condition check karenge agar `i` 2 se divisible hai toh 0 kr denge
            // aur nhi toh 1 kr denge
            if (i % 2 == 0)
                stars = 1;

            else
                stars = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(stars);
                stars = 1 - stars;
            }
            System.out.println();
        }

    }
}