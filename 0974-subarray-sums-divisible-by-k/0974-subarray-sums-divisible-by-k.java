class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] freq = new int[k];
        freq[0] = 1;               // empty prefix remainder 0
        int prefix = 0;
        int count = 0;
        for (int v : nums) {
            prefix += v;
            int mod = ((prefix % k) + k) % k; // handle negative numbers
            count += freq[mod];    // all previous prefixes with same mod
            freq[mod]++;
        }
        return count;
    }
}
