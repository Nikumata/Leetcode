package UniqueMorseCode;

import java.util.HashSet;
import java.util.Set;

public class BestSolution {

	public static int uniqueMorseRepresentations(String[] words) {
        //morse编码对应的字母表
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> normalized = new HashSet<>();
        for (String word : words) {
        	String code = "";
        	for (char c:word.toCharArray()) {
        		code += morse[c - 'a'];
        	}
        	normalized.add(code);
        }
        return normalized.size();
    }
	
	public static void main(String[] args) {
		String[] words = new String[] {"gin", "zen", "gig", "msg"};
		int result = uniqueMorseRepresentations(words);
		System.out.println(result);
	}

}
