class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        return pal(0, s);
    }

    public boolean pal(int i, String s) {

        int n = s.length();

        if (i >= n / 2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(n - 1 - i)) {
            return false;
        }

        return pal(i + 1, s);
    }
}