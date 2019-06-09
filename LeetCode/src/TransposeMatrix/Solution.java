package TransposeMatrix;

public class Solution {

	public static int[][] transpose(int[][] A) {
//		for (int i = 1; i < A.length; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				int temp = A[i][j];
//				A[i][j] = A[j][i];
//				A[j][i] = temp;
//			}
//		}
//		return A;
		int[][] result = new int[A[0].length][A.length];
		for (int i=0; i<result.length; i++) {
			for (int j=0; j<result[i].length; j++) {
				result[i][j] = A[j][i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] input = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int[][] input = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] output = transpose(input);
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j]);
			}
			System.out.println();
		}
	}

}
