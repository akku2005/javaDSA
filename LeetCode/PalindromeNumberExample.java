package LeetCode;

import java.util.Scanner;

public class PalindromeNumberExample {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ek number enter kro:");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " yes this is palindrome number.");
        } else {
            System.out.println(number + " No this is not a palindrome number.");
        }
        sc.close();
    }

    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }
}