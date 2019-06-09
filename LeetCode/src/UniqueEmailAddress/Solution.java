package UniqueEmailAddress;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static int numUniqueEmails(String[] emails) {
		//���ظ��Ļ������ü���,������ӵ�ʱ����Զ�����ظ���
		Set<String> normalized = new HashSet<>();		
		for (String email:emails) {
			String[] parts = email.split("@"); //����@�������ַ����ֿ�
			//��Ҫ��������װ�ַ���
			String[] local = parts[0].split("\\+"); //����+��ϸ��
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
