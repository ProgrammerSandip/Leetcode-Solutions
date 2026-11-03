class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        long sum = 0;
        
        // One pass: Find the highest target and calculate the sum
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        
        // Total moves = (Target * Count) - Current Total
        return (int) ((long) max * nums.length - sum);
    }
}


/*Approach 2 (tc = nlogn & sc nlogn)

class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int temp = nums[n-1];
        int count = 0;
    
        for (int i = 0; i < n; i++) {
            count += (temp - nums[i]); // Accumulate differences using +=
        }

        return count;
    }
}
*/