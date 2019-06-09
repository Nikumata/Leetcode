package SorArrayByParityII;

public class Solution {

	public static int[] sortArrayByParityII(int[] A) {
		int n = A.length;
		int[] output = new int[n];
		int i=0, j=1;
		for (int k=0; k<n; k++) {
			if (A[k]%2 == 0) {
				output[i] = A[k];
				i += 2;
			}else {
				output[j] = A[k];
				j += 2;
			}
		}
		return output;
    }
	
	public static void main(String[] args) {
		int[] input = new int[] { 4, 2, 5, 7 };
		int[] output = sortArrayByParityII(input);
		for (int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}
	}
	
}
