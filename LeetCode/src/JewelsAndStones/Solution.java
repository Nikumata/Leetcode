package JewelsAndStones;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static int numJewelsInStones(String J, String S) {
		int sum = 0;
		Map<Integer, Character> map = new HashMap<>();
		for (int i=0; i<J.length(); i++) {
			map.put(i, J.charAt(i));
		}
		for (int j=0; j<S.length(); j++) {
			if (map.containsValue(S.charAt(j))) sum++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String J = "z";
		String S = "ZZZ";
		int result = numJewelsInStones(J, S);
		System.out.println(result);
	}

}
