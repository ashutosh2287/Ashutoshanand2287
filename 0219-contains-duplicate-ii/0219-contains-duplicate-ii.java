import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Map to store the last index of each number
        HashMap<Integer, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (lastIndex.containsKey(nums[i])) {
                int prevIndex = lastIndex.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true; // found duplicate within k distance
                }
            }
            // update latest index of nums[i]
            lastIndex.put(nums[i], i);
        }

        return false; // no such duplicates found
    }
}
