//1662. Check If Two String Arrays are Equivalent
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) { 
        String word1Str = String.join("", word1);
        String word2Str = String.join("", word2);
        if(word1Str.equals(word2Str)){
            return true;
        }
        return false;
    }
}
