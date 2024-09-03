package JavaBasics;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Taking here the user input
        System.out.println("ENter the number:");
        int num = sc.nextInt();

        // use here do-while loop
        int i = 0;
        do {
            System.out.println("Iteration :" + i);
            i++;
        } while (i < num);
    }
}
