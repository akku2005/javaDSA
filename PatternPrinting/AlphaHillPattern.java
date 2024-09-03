package PatternPrinting;

import java.util.Scanner;

public class AlphaHillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakJoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakJoint)
                    ch++;
                else
                    ch--;
            }
            for (int j = 0; j < num - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
