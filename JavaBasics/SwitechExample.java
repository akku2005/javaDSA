package JavaBasics;

import java.util.Scanner;

public class SwitechExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day between ( 1-7 ) :");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
