class Solution {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}

/* Approach 2 

class Solution {
    public int hammingWeight(int n) {
        String binaryStr = Integer.toBinaryString(n);

        int count = 0;

        // Loop through each character of the binary string
        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}

*/