package ArrayPartitionI;

import java.util.Arrays;

public class Solution {

	public static int arrayPairSum(int[] nums) {
		int maxMin = 0;
		Arrays.sort(nums);
		for (int i=0; i<nums.length;) {
			maxMin += nums[i];
			i += 2;
		}
		return maxMin;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 1, 4, 3, 2 };
		int maxMin = arrayPairSum(input);
		System.out.println(maxMin);
	}

}
