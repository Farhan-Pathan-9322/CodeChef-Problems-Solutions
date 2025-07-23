// LeetCode Problem:
//Plus One : Solving By <9 condition Approch

class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
                digits[i] = 0;
        }
        int[] arr = new int[digits.length + 1];
        for (int j = 0; j < digits.length; j++) {
            if (digits[0] >= 9 || digits[0] == 0) {
                arr[0] = 1;

            } else {
                arr[j] = 0;
            }
        }
        return arr;
    }
}
