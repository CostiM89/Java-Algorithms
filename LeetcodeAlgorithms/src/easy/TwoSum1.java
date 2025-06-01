package easy;

import java.util.Arrays;

public class TwoSum1 {
	public static int[] twoSum(int[] nums, int target) {
		int n = nums.length;

		// Iterate through the array with two pointers i and j
        for (int i=0; i < n - 1; i ++) {
            for (int  j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no solution is found, return an empty array
        return new int[]{};
    }
	
	public static void main(String [] args) {
		int [] array = {2, 7, 11, 15};
		int [] result = twoSum(array, 9);
		System.out.println(Arrays.toString(result));
	}
}
