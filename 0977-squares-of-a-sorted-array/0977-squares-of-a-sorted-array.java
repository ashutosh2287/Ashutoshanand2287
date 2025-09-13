class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l;i++){
            int n=nums[i];
            nums[i]=n*n;
        }
        Arrays.sort(nums);
        return nums;
    }
}