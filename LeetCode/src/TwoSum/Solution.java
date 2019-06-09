package TwoSum;

public class Solution {

	public static int[] twoSum(int[] sums, int target) {
		int[] result = new int[2];
		for (int i=0 ; i<sums.length ; i++) {
			for (int j=i+1 ; j<sums.length; j++) {
				if (sums[i] + sums[j] == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{3,2,4};
		int[] result = twoSum(nums,6);
		for(int i=0;i<2;i++) {
			System.out.println(result[i]);
		}
	}

}
