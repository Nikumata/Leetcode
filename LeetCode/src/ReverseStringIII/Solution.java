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
		System.out.println("不要trim :" + result.toString());
		System.out.println("要trim :" + result.toString().trim());
		return result.toString().trim(); //trim()删除头尾空白符
	}

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String result = reverseWords(s);
		System.out.println(result);
	}

}
