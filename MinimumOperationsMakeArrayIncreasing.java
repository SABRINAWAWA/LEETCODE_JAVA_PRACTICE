// 1827. Minimum Operations to Make the Array Increasing
class Solution {
    public int minOperations(int[] nums) {
        int step=0;
        if(nums.length==1){
            return 0;
        }
        for (int i=0; i<nums.length-1; i++){
            if (nums[i]>=nums[i+1]){
                int temp=nums[i+1];
                nums[i+1]=nums[i]+1;
                step+=(nums[i+1]-temp);
            }
        }
        return step;
    }
}
