package LeetCode;

public class UsingMaxVariable {

    public static void main(String args[]) {
        int arr1[] = { 22, 5, 9, 5, 22, 589 };
        System.out.println("The largestNumber is " + findLargestNumber(arr1));

        int arr2[] = { 88, 9, 9, 888, 4589, 454494 };
        System.out.println("The Largest number is " + findLargestNumber(arr2));

    }

    static int findLargestNumber(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}