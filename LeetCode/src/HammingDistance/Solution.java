package HammingDistance;

public class Solution {

	public static int hammingDistance(int x, int y) {
		int xor = x ^ y, total = 0;
		for (int i=0; i<32; i++) {
			total += (xor >> i) & 1;
		}
		return total;
//		return Integer.bitCount(x ^ y);
    }
	
	public static void main(String[] args) {
		int x = 1, y = 4;
		int result = hammingDistance(x, y);
		System.out.println(result);
	}

}
