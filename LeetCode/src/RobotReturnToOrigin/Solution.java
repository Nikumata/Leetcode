package RobotReturnToOrigin;

public class Solution {

	public static boolean judgeCircle(String moves) {
        int[] direction = new int[2];
        for (char c : moves.toCharArray()) {
        	if (c == 'U') direction[0]++;
        	if (c == 'D') direction[0]--;
        	if (c == 'L') direction[1]++;
        	if (c == 'R') direction[1]--;
        }
        return direction[0] == 0 && direction[1] == 0;
    }
	
	public static void main(String[] args) {
		String input = "LLLLRR";
		boolean output = judgeCircle(input);
		System.out.println(output);
	}

}
