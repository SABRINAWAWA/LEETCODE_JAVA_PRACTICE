// 680. Valid Palindrome II
class Solution {
    public boolean isPalindromeRange(String s, int i, int j) {
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i)) return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                int j = s.length() - 1 - i;
                return (isPalindromeRange(s, i+1, j) ||
                        isPalindromeRange(s, i, j-1));
            }
        }
        return true;
    }
}

// Solution:
int count =0;
public boolean validPalindrome(String s) {
  int last=s.length()-1;
  int first =0;
    while(first<=last)
    {
        if(s.charAt(first)==s.charAt(last))
        {
            first++;
            last--;
        }else {
          if(count==0){
            count++;
            return (validPalindrome(s.substring(first+1,last+1))||validPalindrome(s.substring(first,last)));
          }else return false;
      }
    }
    return true;
  }
}
