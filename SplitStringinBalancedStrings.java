// 1221. Split a String in Balanced Strings
class Solution {
    public int balancedStringSplit(String s) {
        int countR=0;
        int countL=0;
        int count=0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)=='L'){
                countL++;
            }else{
                countR++;
            }
            if(countL==countR){
                count++;
            }
        }
        return count;
    }
}
