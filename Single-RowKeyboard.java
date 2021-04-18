// 1165. Single-Row Keyboard
class Solution {
    public int calculateTime_myAnswer(String keyboard, String word) {
        int time=0;
        int index=0;
        int formerIndex=0;
        for (int i=0; i<word.length(); i++){
            index=keyboard.indexOf(word.charAt(i));
            time+=(Math.abs(index-formerIndex));
            formerIndex=index;
        }
        return time;
    }
  
  public int calculateTime_solution(String keyboard, String word) {
        int[] keyIndices = new int[26];

        // Get the index for each key.
        for (int i = 0; i < keyboard.length(); i++)
            keyIndices[keyboard.charAt(i) - 'a'] = i;

        // Initialize previous index as starting index = 0.
        int prev = 0;
        int result = 0;

        // Calculate the total time.
        for (char c : word.toCharArray()) {
            // Add the distance from previous index
            // to current letter's index to the result.
            result += Math.abs(prev - keyIndices[c - 'a']);

            // Update the previous index to current index for next iteration.
            prev = keyIndices[c - 'a'];
        }
        return result;
    }
}
