//219. Contains Duplicate II
class Solution {
    public boolean containsNearbyDuplicate_bruteforce(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]&&Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public boolean containsNearbyDuplicate(int[] nums, int k){
        Set<Integer> set = new TreeSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
