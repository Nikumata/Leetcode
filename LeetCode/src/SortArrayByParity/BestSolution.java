package SortArrayByParity;

public class BestSolution {

	public static int[] sortArrayByParity(int[] A) {
		for (int i = 0, j = 0; j < A.length; j++) {
			if (A[j] % 2 == 0) {
				int temp = A[i];
				A[i++] = A[j];
				A[j] = temp;
			}
		}
		return A;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 3, 1, 2, 4 };
		int[] output = sortArrayByParity(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
