package PatternPrinting;

import java.util.Scanner;;

public class HalfLeftTrinagle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
