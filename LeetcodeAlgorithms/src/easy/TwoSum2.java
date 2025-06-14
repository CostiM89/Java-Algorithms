package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numToIndex = new HashMap<>();
		
		for (int i=0; i<nums.length; i++) {
			int complement = target - nums[i];
			if (numToIndex.containsKey(complement)) {
				return new int []{numToIndex.get(complement), i};
			}
			numToIndex.put(nums[i], i);
		}
		throw new IllegalArgumentException("No solution found");
    }
	
	public static void main(String [] args) {
		int [] array = {2, 11, 7, 15};
		int [] result = twoSum(array, 9);
		System.out.println(Arrays.toString(result));
	}
}
