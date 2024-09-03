package LeetCode;

class RemoveDuplicateValue {
    public int removeDuplicate(int[] nums) {
        if (nums.length == 0)
            return 0;

        int index = 1;

        for (int i = 1; i < nums.length; i++) { // Start from 1 to compare with the previous element
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveDuplicateValue solution = new RemoveDuplicateValue();
        int[] num1 = { 1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 10 };
        int newLength = solution.removeDuplicate(num1);
        System.out.println("New Length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();
    }
}
