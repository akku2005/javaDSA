package JavaBasics;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        if (num1 / num2 == 0) {
            System.out.println("divisible number");
        } else {
            System.out.println("not divisible");
        }
    }
}
