class Solution {
    public int removeElement(int[] nums, int val) {
        int I=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[I]=nums[i];
            I++; 
        }
      }

      return I;
       
    }
}