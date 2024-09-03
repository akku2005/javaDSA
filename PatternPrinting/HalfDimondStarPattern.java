// question :- *
//  **
//  *** 
//  ****
//  *****
//  ******  
//  *****
//  ****
//  ***    
//  **
//  *

package PatternPrinting;

import java.util.Scanner;

public class HalfDimondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number:");
        int num = sc.nextInt();

        // outer loop
        for (int i = 1; i <= 2 * num - 1; i++) {
            int stars = i;
            if (i > num)
                stars = 2 * num - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
