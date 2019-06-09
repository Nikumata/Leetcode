package MaximunmSubarray;

public class Solution {

	public static void main(String[] args) {

//		int[] input = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		int[] input = new int[] { 4, -3, 5, -2, -1, 2, 6, -2 };
		int result = maxSubArray(input);
		System.out.println(result);
	}

	public static int maxSubArray(int[] nums) {
		// O(n*n)
//		int max = nums[0];
//		int thisMax = nums[0];
//		for (int i=0;i <nums.length; i++) {
//			thisMax = 0;
//			for (int j=i; j <nums.length; j++) {
//				thisMax += nums[j];
//				max = Math.max(max, thisMax);
//			}
//		}
//		return max;
		int thisSum = 0, maxSum = 0;
		for (int i = 0; i < nums.length; i++) {
			thisSum += nums[i];
			if (thisSum > maxSum) {
				maxSum = thisSum;
			} else if (thisSum < 0) {
				thisSum = 0;
			}
		}
		return maxSum;
	}

}
