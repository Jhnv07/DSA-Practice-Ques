class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for next position of valid element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move non-val element to front
                k++;
            }
        }

        return k; // Number of elements not equal to val
    }
}
