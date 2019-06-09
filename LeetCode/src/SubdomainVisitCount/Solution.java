package SubdomainVisitCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static List<String> subdomainVisits(String[] cpdomains) {
		Map<String, Integer> map = new HashMap<>();
		for (String str : cpdomains) {
			String[] line = str.split(" ");
			int count = Integer.parseInt(line[0]);
			String[] domains = line[1].split("\\.");
			String temp = "";
			for (int i = domains.length - 1; i>=0; i--) {
				temp = domains[i] + (temp.equals("") ? temp : "." + temp);
				if (!map.containsKey(temp)) {
					map.put(temp, count);
				}else {
					map.put(temp, map.get(temp) + count);
				}
			}
			
		}
		List<String> res = new ArrayList();
        for(String str : map.keySet()){
            res.add(map.get(str) + " " + str);
        }
        return res;
	}

	public static void main(String[] args) {
		String[] input = new String[] { "9001 discuss.leetcode.com" };
		List<String> list = subdomainVisits(input);
		for (String str : list) {
			System.out.println(str);
		}
	}

}
