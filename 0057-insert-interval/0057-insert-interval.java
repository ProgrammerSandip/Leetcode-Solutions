class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        boolean inserted = false;

        List<int[]> result = new ArrayList<>();

        // Insert newInterval in the correct position
        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];

            if (!inserted && start > newInterval[0]) {
                result.add(newInterval);
                inserted = true;
            }

            result.add(intervals[i]);
        }

        // If newInterval belongs at the end
        if (!inserted) {
            result.add(newInterval);
        }

        List<int[]> ans = new ArrayList<>();

        int start1 = result.get(0)[0];
        int end1 = result.get(0)[1];

        for (int i = 1; i < result.size(); i++) {
            int start2 = result.get(i)[0];
            int end2 = result.get(i)[1];

            // overlapping
            if (end1 >= start2) {
                end1 = Math.max(end1, end2);
            } else {
                ans.add(new int[]{start1, end1});

                start1 = start2;
                end1 = end2;
            }
        }

        ans.add(new int[]{start1, end1});

        return ans.toArray(new int[ans.size()][]);
    }
}