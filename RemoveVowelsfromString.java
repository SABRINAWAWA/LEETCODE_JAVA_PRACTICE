import java.util.Arrays;
import java.util.List;

// 1119. Remove Vowels from a String
class Solution {
    public String removeVowels_stringbuffer(String s) {
        // Creating character array that contains all vowels (upper and lower cases)
        Character vowel[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        // Making the vowel array as a list.  
         List<Character> list = Arrays.asList(vowel);
        // Creating a new object of stringbuffer   
         StringBuffer str = new StringBuffer(s);
        // Using a loop and if statement to check if characters are vowels, if it is, then replace it with "".
         for (int i = 0; i < str.length(); i++) {
             if(list.contains(str.charAt(i))){
                str.replace(i, i+1, "") ;
                i--;
             }
        }
        return str.toString();
    }
    
  // Using regular expression
    public String removeVowels(String s) {
        return s.replaceAll("[aeiouAEIOU]", "");
    }
}
