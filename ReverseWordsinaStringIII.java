// 557. Reverse Words in a String III

class Solution {
    public String reverseWords(String s) {
        String[] string=s.split("\\s+");
	String reversedString = "";
	for (int i = 0; i < string.length; i++)
        {
           String word = string[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		reverseWord = reverseWord + word.charAt(j);
	   }
        if(i!=string.length-1){
	   reversedString = reversedString + reverseWord + " ";}
        else{
            reversedString = reversedString + reverseWord;
        }
	}
        
        return reversedString;
        
    }
}
