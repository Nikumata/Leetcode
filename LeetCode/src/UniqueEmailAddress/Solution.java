package UniqueEmailAddress;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static int numUniqueEmails(String[] emails) {
		//不重复的话可以用集合,这样添加的时候会自动检查重复性
		Set<String> normalized = new HashSet<>();		
		for (String email:emails) {
			String[] parts = email.split("@"); //根据@把邮箱字符串分开
			//按要求重新组装字符串
			String[] local = parts[0].split("\\+"); //根据+再细分
			normalized.add(local[0].replace(".", "") + "@" + parts[1]);
		}
		return normalized.size();
	}
	
	public static void main(String[] args) {
		String[] emails = new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		int sum = numUniqueEmails(emails);
		System.out.println(sum);
	}
}
