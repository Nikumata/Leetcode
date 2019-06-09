package StringToInteger_8;

public class Solutuion {

	public static void main(String[] args) {
		String a = "  +0 123";
		int result = myAtoi(a);
		System.out.println(result);
	}

	public static int myAtoi(String str) {
		boolean spaceFlag = false; // 标识前面有无空格
		int minusFlag = 0; // 标识正负号
		StringBuffer sb = new StringBuffer();
		char[] chars = str.toCharArray();
		int result = 0, INT_MIN = -2147483648, INT_MAX = 2147483647; // 结果
		for (char c : chars) {
			if (c == ' ') { // 当前字符为空格
				if (!spaceFlag) { // 之前无空格
					spaceFlag = true;
				} else { // 之前有空格
					continue;
				}
			} else if (c == '-') { // 是负数
				if (minusFlag != 0) return 0;
				minusFlag = -1;
			} else if (c == '+') { // 是正数
				if (minusFlag != 0) return 0;
				minusFlag = 1;
			} else if (c >= '0' & c <= '9') { // 是数字
				if (c == '0' & sb.length() == 0) continue;
				sb.append(c);
			} else {
				break;
			}
		}
		if (sb.length() == 0) return result;
		try {
			result = minusFlag < 0 ? -Integer.parseInt(sb.toString()) : Integer.parseInt(sb.toString());
			return result;
		} catch (NumberFormatException e) {
			return minusFlag < 0 ? INT_MIN : INT_MAX;
		}
	}

}
