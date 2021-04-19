// 1213. Intersection of Three Sorted Arrays
class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result=new ArrayList<Integer>();
        Map<Integer, Integer> count=new HashMap<Integer, Integer>();
        for (int i=0; i<arr1.length; i++){
            count.put(arr1[i], 1);
        }
        for (int j=0; j<arr2.length; j++){
            if(count.containsKey(arr2[j])){
                count.put(arr2[j], 2);
            }else{
                count.put(arr2[j], 1);
            }
        }
        for (int a=0; a<arr3.length; a++){
            if(count.containsKey(arr3[a])&&count.get(arr3[a])==2){
                count.put(arr3[a], 3);
            }else if(count.containsKey(arr3[a])&&count.get(arr3[a])==1){
                count.put(arr3[a], 2);
            }else{
                count.put(arr3[a], 1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if (value==3){
                result.add(key);
            }
        }
     return result;   
    }
}
