package UniqueMorseCode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static int uniqueMorseRepresentations(String[] words) {
        //morse编码对应的字母表
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> normalized = new HashSet<>();
        for (String word : words) {
        	StringBuffer sb = new StringBuffer();
        	for (int i=0; i<word.length(); i++) {
        		sb.append(morse[word.charAt(i) - 'a']);
        	}
        	normalized.add(sb.toString());
        }
        
        return normalized.size();
    }
	
	public static void main(String[] args) {
		String[] words = new String[] {"gin", "zen", "gig", "msg"};
		int result = uniqueMorseRepresentations(words);
		System.out.println(result);
	}

}
