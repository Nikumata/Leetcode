package NRepeatedElementInSize2NArray;

public class BestSolution {
	public static int repeatedNTimes(int[] A) {
		for (int i=2; i<A.length; i++) {
			if (A[i] == A[i-1] || A[i] == A[i-2]) {
				return A[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 3 };
		int result = repeatedNTimes(input);
		System.out.println(result);
	}
}
