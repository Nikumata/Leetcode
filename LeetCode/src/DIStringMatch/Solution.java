package DIStringMatch;

public class Solution {

	public static int[] diStringMatch(String S) {
        int n = S.length();
        int left = 0, right = n;
        int[] result = new int[n+1];
        for (int i=0; i<n; i++) {
        	result[i] = S.charAt(i) == 'I' ? left++ : right--;
        }
        result[n] = left;
        return result;
        
    }
	
	public static void main(String[] args) {
		String input = "IDID";
		int[] output = diStringMatch(input);
		for (int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
