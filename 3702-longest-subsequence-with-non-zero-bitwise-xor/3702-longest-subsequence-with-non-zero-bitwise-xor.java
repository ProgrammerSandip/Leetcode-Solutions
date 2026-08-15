class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;

        int resultXor = 0;
        boolean allZero = true;

        for(int x : nums) {
            resultXor ^= x;
            if(x != 0) 
            //We found atleast one element which is non-zero, So allZero == false
                allZero = false;
        }

        if(allZero)
        //we cant take anu subsequences
            return 0;
        
        return resultXor == 0 ? n-1 : n;
    }
}