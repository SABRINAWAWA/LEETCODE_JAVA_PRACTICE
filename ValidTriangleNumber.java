// 611. Valid Triangle Number
class Solution {
    public int triangleNumber(int[] nums) {
        int count=0;
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                for(int z=j+1; z<nums.length; z++){
                    if(valid(nums[i], nums[j], nums[z])){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    private boolean valid(int a, int b, int c){
        return a+b>c && b+c>a && a+c>b;
    }
}
