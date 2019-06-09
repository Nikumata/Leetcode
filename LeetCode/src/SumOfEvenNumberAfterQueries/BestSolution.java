package SumOfEvenNumberAfterQueries;

public class BestSolution {
	public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int sum = 0;
		for (int a:A) {
			if (a%2 == 0) sum += a;
		}
		int[] even = new int[queries.length];
		for (int i=0; i<queries.length; i++) {
			int index = queries[i][1];
			if (A[index] % 2 == 0) sum -= A[index];
			A[index] += queries[i][0];
			if (A[index] % 2 == 0) sum += A[index];
			even[i] = sum;
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
