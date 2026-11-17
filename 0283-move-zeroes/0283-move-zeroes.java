class Solution {
    public void moveZeroes(int[] nums) {

        int left = 0;
        int right = 1;

        while (right < nums.length) {

            if (nums[left] != 0) {
                left++;
                right = Math.max(right, left + 1);
            }
            else if (nums[right] == 0) {
                right++;
            }
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right++;
            }
        }
    }
}