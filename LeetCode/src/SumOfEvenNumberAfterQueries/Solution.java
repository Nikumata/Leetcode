package SumOfEvenNumberAfterQueries;

public class Solution {

	public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int n = queries.length;
		int[] even = new int[n];
		for (int i=0; i<queries.length; i++) {
			A[queries[i][1]] += queries[i][0];
			for (int k=0; k<n; k++) {
				if (A[k]%2 == 0) even[i] += A[k];
			}
		}
		return even;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4 };
		int[][] queries = new int[][] { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
		int[] result = sumEvenAfterQueries(input, queries);
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
