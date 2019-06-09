package MajorityElement;

public class Solution {

	public static int majorityElement(int[] nums) {
		int c = nums[0], count = 1;
		for (int i=1; i<nums.length; i++) {
			if (nums[i] == c) count++;
			else count--;
			if (count < 1) {
				c = nums[i]; count = 1;
			} 
		}
		return c;
    }
	
	public static void main(String[] args) {
//		int[] input = new int[] {2,2,1,1,1,2,2};
		int[] input = new int[] {3,2,3};
//		int[] input = new int[] {10,9,9,9,10};
		System.out.println(majorityElement(input));
	}

}
