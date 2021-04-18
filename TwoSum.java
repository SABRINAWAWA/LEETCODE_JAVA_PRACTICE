import java.util.Arrays;
import java.util.HashMap;

// 1. Two Sum: 
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(target - nums[i])) {
				return new int[] { i, hm.get(target - nums[i]) };
			}
			hm.put(nums[i], i);
		}
		return (new int[] {});
	}

	public static int[] twoSum_brute(int[] nums, int target) {
		int[] results = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					results[0] = i;
					results[1] = j;
				}
			}
		}
		return results;
	}

	public static void main(String[] args) {
		int[] nums1 = { 2, 7, 11, 15 };
		int[] nums2 = { 3, 2, 4 };
		int[] nums3 = { 3, 3 };
		
		// Correct answer is [0,1]
		System.out.println(Arrays.toString(twoSum(nums1, 9)));
		// Correct answer is [1,2]
		System.out.println(Arrays.toString(twoSum(nums2, 6)));
		// Correct answer is [0,1]
		System.out.println(Arrays.toString(twoSum(nums3, 6)));
	}
}
