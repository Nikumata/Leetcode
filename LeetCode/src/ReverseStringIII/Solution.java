package ReverseStringIII;

public class Solution {

	public static String reverseWords(String s) {
		String[] ss = s.split(" ");
		for (int i=0; i<ss.length; i++) {
			ss[i] = new StringBuffer(ss[i]).reverse().toString();
		}
		StringBuffer result = new StringBuffer();
		for (String str : ss) {
			result.append(str + " ");
		}
		System.out.println("��Ҫtrim :" + result.toString());
		System.out.println("Ҫtrim :" + result.toString().trim());
		return result.toString().trim(); //trim()ɾ��ͷβ�հ׷�
	}

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String result = reverseWords(s);
		System.out.println(result);
	}

}
