package StringToInteger_8;

public class BestSolution {

	public static void main(String[] args) {
		String a = " ";
		int result = myAtoi(a);
		System.out.println(result);
	}

	public static int myAtoi(String str) {
		int index = 0, sign = 1, total = 0;
		// 1. 空字符串
		if (str.length() == 0) return 0;

		// 2. 去除空格
		str = str.trim();

		if (index == str.length()) return 0;
		
		// 3. 处理符号
		if (str.charAt(index) == '-' || str.charAt(index) == '+') {
			sign = str.charAt(index) == '+' ? 1 : -1;
			index++;
		}

		// 4.转换数
		while (index < str.length()) {
			int digit = str.charAt(index) - '0';
			if (digit < 0 || digit > 9) break;

			// check if total will be overflow after 10 times and add digit
			if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

			total = 10 * total + digit;
			index++;

		}
		return total * sign;
	}

}
