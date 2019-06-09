package MonotonicArray;

public class Solution {

	public static boolean isMonotonic(int[] A) {
		boolean inc = true, dec = true;
		for (int i = 1; i < A.length; i++) {
			inc &= A[i - 1] <= A[i];
			dec &= A[i - 1] >= A[i];
		}
		return inc || dec;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 1, 3, 2 };
		System.out.println(isMonotonic(input));
	}

}
