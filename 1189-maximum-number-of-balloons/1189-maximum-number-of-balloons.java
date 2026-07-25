class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();

        HashMap <Character, Integer> have = new HashMap<>();
        HashMap <Character, Integer> need = new HashMap<>();

        //Store text in map with freq
        for(int i = 0; i < n; i++)
        {
            char ch = text.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        //Store The 'ballon' freq in need
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);

        int ans = Integer.MAX_VALUE;

        for(char ch : need.keySet())
        {
            int available = have.getOrDefault(ch, 0);
            int required = need.get(ch);

            ans = Math.min(ans, available / required);
        }

        return ans;
    }
}