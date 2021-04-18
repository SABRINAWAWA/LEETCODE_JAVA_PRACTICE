// 709. To Lower Case
class Solution {
    public String toLowerCase(String str) {
        // Using bulid-in solution
        //return str.toLowerCase();
        
        //mapping upper and lower characters into hashmap
        Map<Character, Character> h = new HashMap();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 26; ++i) {
          h.put(upper.charAt(i), lower.charAt(i));
        }
        
        // change upper to lower
        StringBuilder sb = new StringBuilder();
        for (char x : str.toCharArray()) {
          sb.append(h.containsKey(x) ? h.get(x) : x);
        }
        return sb.toString();
    }
}
