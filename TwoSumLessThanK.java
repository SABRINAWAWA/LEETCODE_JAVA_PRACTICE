import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 1099. Two Sum Less Than K

public class TwoSumLessThanK {
    public static int twoSumLessThanK_brute(int[] nums, int k) {
    	ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++) {
        	for(int j=i+1; j<nums.length; j++) {
        		int sum=nums[i]+nums[j];
        		if(sum<k) {
        			result.add(sum);
        		}
        	}
        }
        if(result.size()==0) {
        	return -1;
        }else {
        	return Collections.max(result);
        }
    }
    
    public static int twoSumLessThanK(int[] nums, int k) {
    	 Arrays.sort(nums);
         int answer = -1;
         int left = 0;
         int right = nums.length - 1;
         while (left < right) {
             int sum = nums[left] + nums[right];
             if (sum < k) {
                 answer = Math.max(answer, sum);
                 left++;
             } else {
                 right--;
             }
         }
         return answer;
    }
    
    public static void main(String[] args) {
		int[] nums1 = { 34,23,1,24,75,33,54,8 };
		int[] nums2 = { 10,20,30 };
		int[] nums3 = { 3, 3 };
		
		// Correct answer is 58
		System.out.println(twoSumLessThanK(nums1, 60));
		// Correct answer is -1
		System.out.println(twoSumLessThanK(nums2, 15));
		// Correct answer is 6
		System.out.println(twoSumLessThanK(nums3, 7));
	}
}
