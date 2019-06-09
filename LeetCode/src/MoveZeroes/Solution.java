package MoveZeroes;

public class Solution {

	public static void moveZeroes(int[] nums) {
		int index = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}
		for (int j=index; j<nums.length; j++) { nums[j] = 0;}
    }
	
	public static void main(String[] args) {
		int[] input = new int[] {0,1,0,3,12};
		moveZeroes(input);
		for (int i=0; i<input.length; i++) {
			System.out.println(input[i]);
		}
	}

}
