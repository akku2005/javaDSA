package JavaBasics;

import java.util.Scanner;

public class IfAgeGreater {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("YOU can vote");
        } else {
            System.out.println("No you can't vote");
        }
    }
}
