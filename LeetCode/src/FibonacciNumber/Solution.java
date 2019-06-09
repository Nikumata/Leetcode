package FibonacciNumber;

public class Solution {

	public static int fib(int N) {
        if (N <= 1) return N;
        else return fib(N-1) + fib(N-2);
    }

	public static void main(String[] args) {
		int input = 2;
		int result = fib(input);
		System.out.print(result);
	}

}
