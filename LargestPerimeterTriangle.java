//976. Largest Perimeter Triangle
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
       int max=0;
        for( int i=0;i<nums.length-2; i++){
          if(isTriangle(nums[i], nums[i+1], nums[i+2])){
              int peri=nums[i]+nums[i+1]+nums[i+2];
              if(peri>max)
                  max=peri;
          }   
        }
        return max;
    }
    
    private boolean isTriangle(int a, int b, int c){
        return a+b>c && b+c>a && a+c>b;
    }
}
