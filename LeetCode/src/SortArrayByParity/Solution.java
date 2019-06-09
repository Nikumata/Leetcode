package SortArrayByParity;

public class Solution {

	public static int[] sortArrayByParity(int[] A) {
		int n = A.length;
		int[] result = new int[n];
		int sum = 0; //±êÊ¶Å¼Êý
		for (int i=0; i<n; i++) {
			if (A[i]%2 == 0) {
				result[sum++] = A[i];
			}
		}
		for (int j=0; j<n; j++) {
			if (A[j]%2 == 1) {
				result[sum++] = A[j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 3, 1, 2, 4 };
		int[] output = sortArrayByParity(input);
		for (int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
