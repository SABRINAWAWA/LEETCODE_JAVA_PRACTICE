// 163. Missing Ranges
class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        // Creating new list for result.
        List<String> result=new ArrayList<String>();
        int current=0;
        int prev=lower-1;
        
        for(int i=0; i<=nums.length; i++){
            // if loop reaches the last number, the current number will be upper +1;
            if(i<nums.length){
                current=nums[i];
            }else{
                current=upper+1;
            }
            
            if(prev+1<=current-1){
                result.add(formatRange(prev+1, current-1));
            }
            
            prev=current;
        }
        return result;
    }
    
    // formats range in the requested format
    private String formatRange(int lower, int upper){
        if(lower==upper){
            return String.valueOf(lower);
        }
        return lower+"->"+upper;
    }
}
