package NumberComplement;

public class Solution {

    public static int findComplement(int num) {
    	int i=0, j=0;
    	while (i < num) {
    		i += Math.pow(2, j);
    		j++;
    	}
    	return i - num;
    }
	
	public static void main(String[] args) {
		int num = 5;
		int result = findComplement(num);
		System.out.println(result);
	}

}
