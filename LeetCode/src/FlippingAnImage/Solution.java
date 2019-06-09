package FlippingAnImage;

public class Solution {

	public static int[][] flipAndInvertImage(int[][] A) {
		int n = A.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = A[i][j];
				A[i][j] = Math.abs(A[i][n - 1 - j] - 1);
				A[i][n - 1 - j] = Math.abs(temp - 1);
			}
			if (n%2 == 1) {
				A[i][n/2] = Math.abs(A[i][n/2] - 1);
			}
		}
		return A;
	}

	public static void main(String[] args) {
//		int[][] input = new int[][] { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
		int[][] input = new int[][] { {1,1,0}, {1,0,1}, {0,0,0}};
		int[][] output = flipAndInvertImage(input);
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < output[i].length; j++) {
				System.out.println(output[i][j]);
			}
		}
	}

}
