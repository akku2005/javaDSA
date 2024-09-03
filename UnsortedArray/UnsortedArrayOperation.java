package UnsortedArray;

public class UnsortedArrayOperation {

    public static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 50, 6, 066, 01 };
        int x = 01;
        int result = search(arr, x);
        if (result == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found At Index : " + result);
        }
    }
}