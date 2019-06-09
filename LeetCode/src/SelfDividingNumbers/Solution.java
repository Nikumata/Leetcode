package SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
    	for (int i=left, n=0; i<=right; i++) {
    		for (n = i; n > 0; n /= 10) {
    			if (n % 10 == 0 || i % (n % 10) != 0) break;
    		}
    		if (n == 0) list.add(i);
    	}
    	return list; 
    }

	public static void main(String[] args) {
		int left = 1, right = 22;
		List<Integer> list = selfDividingNumbers(left, right);
		for (Integer i : list) {
			System.out.println(i);
		}
	}

}
