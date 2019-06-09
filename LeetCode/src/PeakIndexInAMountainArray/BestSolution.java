package PeakIndexInAMountainArray;

public class BestSolution {

	public static int peakIndexInMountainArray(int[] A) {
        for (int i=1; i+1<A.length; ++i) {
        	if (A[i] > A[i+1]) return i;
        }
        return 0;
    }
	
	public static void main(String[] args) {
		int[] input = new int[] {3,4,5,1};
		System.out.println(peakIndexInMountainArray(input));
	}

}
