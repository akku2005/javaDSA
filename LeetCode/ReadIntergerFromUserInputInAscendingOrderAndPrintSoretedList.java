package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadIntergerFromUserInputInAscendingOrderAndPrintSoretedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take user input
        System.err.print("Enter the number of intergers:");
        int n = sc.nextInt();

        // integer arry initalize karna
        int[] array = new int[n];

        // user se integer input karne ke liye kahna
        System.out.print("Enter an integer: ");
        for (int i = 0; i <= n; i++) {
            array[i] = sc.nextInt();

        }
        // Array ko sort karna
        Arrays.sort(array);

        // sorted array ko print karna
        System.out.print("Sorted list of integer is:");
        for (int numbers : array) {
            System.out.print(numbers + " ");
        }
        System.out.println();
        sc.close();
    }
}
