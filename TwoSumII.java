import java.util.Arrays;

//167. Two Sum II - Input array is sorted
public class TwoSumII {
    public static int[] twoSum_brute(int[] numbers, int target) {
        int[] result=new int[2];
        for(int i=0; i<numbers.length; i++) {
        	for(int j=1+i; j<numbers.length; j++) {
        		if((numbers[i]+numbers[j])==target) {
        			result[0]=i+1;
        			result[1]=j+1;
        		}
        	}
        }
        return result;
    }
    
    public static int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length-1; 
        while(first<last){
            int sum = numbers[first]+numbers[last];
            if(sum == target) return new int[]{first+1,last+1};
            if(sum < target){
                first++;
            }else {
                last--;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
		int[] nums1 = { 2,7,11,15 };
		int[] nums2 = { 2,3,4 };
		int[] nums3= {-1,0};
		System.out.println(Arrays.toString(twoSum(nums1, 9)));
		System.out.println(Arrays.toString(twoSum(nums2, 6)));
		System.out.println(Arrays.toString(twoSum(nums3, -1)));
    }
}
