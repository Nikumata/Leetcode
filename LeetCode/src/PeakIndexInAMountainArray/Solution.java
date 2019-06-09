package PeakIndexInAMountainArray;

public class Solution {

	public static int peakIndexInMountainArray(int[] A) {
        int n = A.length, i=0, j=n-1;
		for (; i<A.length & j>=0 & i<j;) {
        	if (A[i+1] > A[i]) i++;
        	if (A[j] < A[j-1]) j--;  
        }
		return i;
    }
	
	public static void main(String[] args) {
		int[] input = new int[] {3,4,5,1};
		System.out.println(peakIndexInMountainArray(input));
	}

}
