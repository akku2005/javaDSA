package JavaBasics;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print a iteration:");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println("Iteration:" + i);
        }
    }
}
