// 345. Reverse Vowels of a String
class Solution {
    public String reverseVowels(String s) {
         if(s == null || s.length()==0) return s;
        char ch[]=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start < end)
        {
            while(start < end && (ch[start]!='a' && ch[start]!='e' && ch[start]!='i' && ch[start]!='o' && ch[start]!='u' 
							  &&  ch[start]!='A' && ch[start]!='E' && ch[start]!='I' && ch[start]!='O' && ch[start]!='U'))
            {
                start++;  
            }
            while(start < end && (ch[end]!='a'&& ch[end]!='e' && ch[end]!='i' && ch[end]!='o' && ch[end]!='u' 
							  &&  ch[end]!='A' && ch[end]!='E' && ch[end]!='I' && ch[end]!='O' && ch[end]!='U'))
            {
                end--;
            }
            if(start < end)
            {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
            }
            start++;
            end--;
        }
        String reverse=String.valueOf(ch);
        return reverse;     
    }
}
