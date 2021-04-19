// 1528. Shuffle String
class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer,Character> map = new HashMap<>();
        for (int i=0; i<indices.length; i++){
            map.put(indices[i], s.charAt(i));
        }
        
        char[] arr=new char[map.size()];
        for (int i=0; i<map.size(); i++){
            arr[i]=map.get(i);
        }
        return String.valueOf(arr);
    }
}
