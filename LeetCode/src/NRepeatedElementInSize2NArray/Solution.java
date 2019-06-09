package NRepeatedElementInSize2NArray;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static int repeatedNTimes(int[] A) {
		Set<Integer> normalized = new HashSet<>();
		for (int a:A) {
			if (!normalized.add(a)) {
				return a;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 3 };
		int result = repeatedNTimes(input);
		System.out.println(result);
	}

}
