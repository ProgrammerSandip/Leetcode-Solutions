class Solution {
    public int minimumPushes(String word) {
        int [] mp = new int[26];

        //Generic Solution
        for(char ch : word.toCharArray())
        {
            mp[ch - 'a']++; //Mention int quation, all letters will be distinct
        }

        //Decending order of frequency
        Integer[] mpInteger = Arrays.stream(mp).boxed().toArray(Integer[]::new);
        Arrays.sort(mpInteger, Comparator.reverseOrder());

        int ans = 0;
        for(int i = 0; i < 26; i++)
        {
            ans += mpInteger[i] * ((i / 8) + 1);
        }

        return ans;
    }
}