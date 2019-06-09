package ReverseString;

public class Solution {

    public static void reverseString(char[] s) {
        char temp;
    	for (int i=0; i<s.length/2; i++) {
        	temp = s[i];
        	s[i] = s[s.length - 1 - i];
        	s[s.length - 1 - i] = temp;
        }
    }
	
	public static void main(String[] args) {
		char[] s = new char[] {'h','e','l','l','o','1','3','4'};
		reverseString(s);
		System.out.println(s);
	}

}
