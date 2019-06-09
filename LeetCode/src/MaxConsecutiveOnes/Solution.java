package MaxConsecutiveOnes;

public class Solution {

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, current = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i] == 1) {current++;}
			if (nums[i] == 0) {
				if (current > max) {
					max = current;
				}
				current = 0;
			}
		}
		return max > current ? max : current;	
	}

	public static void main(String[] args) {
		int[] input = new int[] { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(input));
	}

}
