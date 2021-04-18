// 1816. Truncate Sentence
class Solution {
    public String truncateSentence(String s, int k) {
        String[] strArr=s.split(" ");
        String[] subArray = Arrays.copyOfRange(strArr, 0, k);
        return String.join(" ", subArray);
    }
}
