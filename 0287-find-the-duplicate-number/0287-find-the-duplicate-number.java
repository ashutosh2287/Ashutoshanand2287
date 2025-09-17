public class Solution {
    public int findDuplicate(int[] nums) {
        // Phase 1: find intersection of tortoise and hare
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];         // move 1 step
            fast = nums[nums[fast]];   // move 2 steps
        } while (slow != fast);

        // Phase 2: find entrance to cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow; // duplicate number
    }
}