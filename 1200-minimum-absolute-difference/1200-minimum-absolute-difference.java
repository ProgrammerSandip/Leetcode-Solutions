class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(arr);
        int first = arr[1] - arr[0];

        // Find minimum difference
        for (int i = 1; i < n; i++) {
            int diff = arr[i] - arr[i - 1];

            if (diff < first) {
                first = diff;
            }
        }

        // Store all pairs having minimum difference
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == first) {
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return res;
    }
}