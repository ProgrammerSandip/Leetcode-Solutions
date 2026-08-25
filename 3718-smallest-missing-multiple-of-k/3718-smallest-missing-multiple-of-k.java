class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int multiple = k;

        for(int num : nums)
        {
            if(num == multiple)
            {
                multiple = multiple + k;
            }
        }
        return multiple;
    }
}

/*
Approach 2, using HashSet

class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        // Store all numbers in the Set
        for (int num : nums) {
            set.add(num);
        }

        // Start checking multiples of k
        int multiple = k;

        while (set.contains(multiple)) {
            multiple = multiple + k;
        }

        return multiple;
    }
}
*/