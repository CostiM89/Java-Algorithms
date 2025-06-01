package easy;
public class FibonacciNumber_recursive {
	
	 public static int fib(int n) {
		 if (n < 2) {
			 return n;
	     } else {
	    	 return fib(n-1) + fib(n-2);
	     }
	 }
	 
	 public static void main(String [] args) {
		 int n = 8;
		 System.out.println(FibonacciNumber_recursive.fib(n));
	 }
}
