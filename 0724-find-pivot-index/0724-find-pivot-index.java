class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int tsum = 0;
        for (int num : nums) {
            tsum += num;
        }
        int lsum=0;
        for(int i=0;i<n;i++){
            int rsum=tsum-lsum-nums[i];
            if(lsum==rsum) return i;
            lsum+=nums[i];
        }
        return -1;

    }
}