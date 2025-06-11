public class leetcode66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // No carry needed
                return digits;
            }
            digits[i] = 0;  // Set current digit to 0 and carry over
        }

        // If all digits were 9, we need a new array
        int[] result = new int[n + 1];
        result[0] = 1; // e.g., 999 + 1 = 1000
        return result;
    }
}
