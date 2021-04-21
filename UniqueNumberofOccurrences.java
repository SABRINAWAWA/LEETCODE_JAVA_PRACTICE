//1207. Unique Number of Occurrences

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count=new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){
            if(!count.containsKey(arr[i])){
                count.put(arr[i], 1);
            }else{
                int num=count.get(arr[i]);
                count.put(arr[i], ++num);
            }
        }
        
        Set<Integer> set = new HashSet<>();
        for (Map.Entry entry : count.entrySet()){
            int val = (int) entry.getValue();
            if (!set.add(val)){
                return false;
            }
        }
        return true;
    }
}
