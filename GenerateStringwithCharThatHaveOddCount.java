// 1374. Generate a String With Characters That Have Odd Counts
class Solution {
    public String generateTheString(int n) {
        String str1="a";
        String str2="b";
        if(n%2==0){
            return (str1.repeat(n-1)+str2);
        }else{
            return str1.repeat(n);
        }
    }
}
