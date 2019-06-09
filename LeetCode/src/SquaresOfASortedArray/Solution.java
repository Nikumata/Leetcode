package SquaresOfASortedArray;

public class Solution {

	public static int[] sortedSquares(int[] A) {
		int n = A.length;
		int[] result = new int[n];
		int i=0, j=n-1;
		for (int k=n-1; k>=0; k--) {
			if(Math.abs(A[j]) > Math.abs(A[i])) {
				result[k] = A[j] * A[j];
				j--;
			}else {
				result[k] = A[i] * A[i];
				i++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] input = new int[] { -4, -1, 0, 3, 10 };
		int[] result = sortedSquares(input);
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
