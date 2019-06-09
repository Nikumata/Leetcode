package ReshapeTheMatrix;

public class Solution {

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r * c != nums.length * nums[0].length) return nums;
		int[][] reshape = new int[r][c];
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				reshape[sum/c][sum++%c] = nums[i][j];
			}
		}
        return reshape;
    }
	
	public static void main(String[] args) {
		int[][] nums = new int[][] {{1,2},{3,4}};
		int r = 2, c = 4;
		int[][] output = matrixReshape(nums, r, c);
		for (int i=0; i<output.length; i++) {
			for (int j=0; j<output[i].length; j++) {
				System.out.print(output[i][j]);
			}
			System.out.println();
		}
	}

}
