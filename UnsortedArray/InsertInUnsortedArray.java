package UnsortedArray;

public class InsertInUnsortedArray {
    // function to insert an element in an unsorted array
    public static int insert(int arr[], int n, int x, int capacity) {
        if (n >= capacity) {
            return n; // Array is full , cannot insert
        }
        arr[n] = x;
        return n + 1; // Return new size of array
    }

    public static void main(String args[]) {
        int arr[] = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;
        int n = 1; // current size of the array
        int x = 120;
        n = insert(arr, n, x, arr.length);

        System.out.println("Array after insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
