//771. Jewels and Stones
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Set<Character> hash_Set = new HashSet<Character>();
        for (int i=0; i<jewels.length(); i++){
            hash_Set.add(jewels.charAt(i));
        }
        for(int j=0; j<stones.length(); j++){
            if(hash_Set.contains(stones.charAt(j))){
                count++;
            }
        }
        return count;
    }
}

/*
Time Complexity: O(J\text{.length} + S\text{.length})O(J.length+S.length). The O(J\text{.length})O(J.length) part comes from creating J. 
The O(S\text{.length})O(S.length) part comes from searching S.
Space Complexity: O(J\text{.length})O(J.length).
*/
