package FindCommonCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        boolean flag = false;
		Map<Character, Integer> map = new HashMap<>();
        for (String str : A) {
        	for (int i=0; i<str.length(); i++) {
        		if (map.containsKey(str.charAt(i))) {
        			map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
        		} else {
        			if (!flag) {
        				map.put(str.charAt(i), 1);	
        			}
        		}	
        	}
        	flag = true;
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        	for (int j=0; j<entry.getValue(); j++) {
        		list.add(entry.getKey().toString());
        	}
        }
        return list;
    }
	
	public static void main(String[] args) {
		String[] input = new String[] {"bella", "label", "roller"};
		List<String> list = commonChars(input);
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
