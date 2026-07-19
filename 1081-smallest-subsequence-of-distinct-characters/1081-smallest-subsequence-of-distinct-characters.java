class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();

        boolean[] taken = new boolean[26];
        int[] lastIndex = new int[26];

        // Store the last occurrence of each character
        for (int i = 0; i < n; i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            // Skip if already in the result
            if (taken[idx]) {
                continue;
            }

            // Remove larger characters if they appear again later
            while (result.length() > 0 &&
                   ch < result.charAt(result.length() - 1) &&
                   lastIndex[result.charAt(result.length() - 1) - 'a'] > i) {

                taken[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }

            // Add current character
            result.append(ch);
            taken[idx] = true;
        }

        return result.toString();
    }
}