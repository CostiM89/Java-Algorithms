package easy;

public class FibonacciNumber {
	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}

		int a = 0, b = 1, c = 0;

		for (int i = 1; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		int n = 8;
		System.out.println(FibonacciNumber.fib(n));
	}
}
