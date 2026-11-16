class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        //Creating hashset for removing duplicates.
        HashSet<Integer> set1 = new HashSet<>(); //for nums1
        HashSet<Integer> set2 = new HashSet<>(); //for nums2

        //count variable for keep counting of existing elements.
        int count1 = 0;
        int count2 = 0;

        //adding nums1 in set1, no duplicates
        for(int num : nums1)
        {
            set1.add(num);
        }

        //adding num2 in set2, no duplicates
        for(int num : nums2)
        {
            set2.add(num);
        }

        //checking set1 cointaing in set2
        for(int num : nums1)
        {
            if(set2.contains(num))
            {
                count1++;
            }
        }

        //checking set2 exits in set1
        for(int num : nums2)
        {
            if(set1.contains(num))
            {
                count2++;
            }
        }

        //return in new array
        return new int[]{count1, count2};
    }
}