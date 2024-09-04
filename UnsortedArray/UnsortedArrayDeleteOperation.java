package UnsortedArray;

public class UnsortedArrayDeleteOperation {
    public static int delete(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        if (i == n) {
            return n;
        }
        arr[i] = arr[n - 1];
        return n - 1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        System.out.println("The size of the Array before deletion is :" + arr);
        int n = arr.length;
        int x = 30;
        n = delete(arr, n, x);
        System.out.println("Array after deletion");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}
