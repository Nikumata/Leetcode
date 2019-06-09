package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class BestSolution {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer,Integer> map = new HashMap<>();
		for (int i=0; i<nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]) - 1;
				return result;
			}
			map.put(nums[i], i+1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{2,7,11,15};
		int[] result = twoSum(nums,9);
		for(int i=0;i<2;i++) {
			System.out.println(result[i]);
		}
	}

}
