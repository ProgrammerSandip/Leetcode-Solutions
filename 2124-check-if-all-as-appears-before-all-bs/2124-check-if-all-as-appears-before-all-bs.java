class Solution
{
    public boolean checkString(String s)
    {
        int n = s.length();

        for(int i = 1; i < n; i++)
        {
            if(s.charAt(i-1) == 'b' && s.charAt(i) == 'a')
            {
                return false;
            }
        }
        return true;
    }
}

/*
class Solution {
    public boolean checkString(String s) {
        int last_a = -1;
        int first_b = s.length(); // Default to length if no 'b' exists
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                last_a = i;
            } else if (first_b == s.length()) { 
                // Record only the very first 'b'
                first_b = i;
            }
        }
        
        return last_a < first_b;
    }
}
*/
