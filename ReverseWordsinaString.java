// 151. Reverse Words in a String
import java.util.Arrays;

class Solution {
    public String reverseWords(String s) {
        String[] stringArr=s.trim().split("\\s+");
        String result="";
        for(int i=0; i<stringArr.length/2; i++){ 
            String temp = stringArr[i]; 
            stringArr[i] = stringArr[stringArr.length -i -1]; 
            stringArr[stringArr.length -i -1] = temp; 
        }

        // String result=Arrays.toString(stringArr);
        for(int i=0; i<stringArr.length; i++){ 
            if(i!=stringArr.length-1)
                result+=(stringArr[i]+" ");
            else
                result+=stringArr[i];
        }
        return result;
    }
}
