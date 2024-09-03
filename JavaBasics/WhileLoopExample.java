package JavaBasics;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String args[]) {
        // Taking here the user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of iteration:");
        int num = sc.nextInt();

        // using while loop
        int i = 0;
        while (i < num) {
            System.out.println("Iteration" + i);
            i++;
        }
    }
}
