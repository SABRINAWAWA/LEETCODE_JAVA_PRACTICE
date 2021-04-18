// 1323. Maximum 69 Number
class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        String[] numArr=str.split("");
        for(int i=0; i<numArr.length; i++){
            if(numArr[i].equals("6")){
                numArr[i]="9";
                String resultStr=String.join("", numArr);
                return Integer.parseInt(resultStr);
            }
        }
        return num;
    }
}
