// 58. Length of Last Word
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0)
            return 0;
        String[] strArr=s.split(" ");
        if(strArr.length>=1){
            return strArr[strArr.length-1].length();
        }
        return 0;
    }
}
