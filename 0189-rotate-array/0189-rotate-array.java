class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int [] temp = new int [k];

        k = k % n;

        // Step 1: Store last k elements
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

         // Step 2: Shift remaining elements right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Step 3: Copy temp elements to beginning
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        
    }
}