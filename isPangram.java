// 1832. Check if the Sentence Is Pangram
class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> hash_Set = new HashSet<Character>();
        for (int i=0; i<sentence.length(); i++){
            hash_Set.add(sentence.charAt(i));
        }
        return hash_Set.size()==26;
    }
}
