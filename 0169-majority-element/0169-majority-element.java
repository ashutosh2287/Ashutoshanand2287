class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int c=0;
        int maj=0;
        for(int i=0;i<n;i++){
            if(c==0){
                maj=nums[i];
            }
            if(nums[i]==maj){
                c++;
            }else{
                c--;
            }
        }
        return maj;
    }
}