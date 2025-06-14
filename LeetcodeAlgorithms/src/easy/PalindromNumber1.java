package easy;

//The intuition behind this code is to reverse the entire input number and check if the reversed number is equal to the original number. 
//If they are the same, then the number is a palindrome.
public class PalindromNumber1 {
	public static boolean isPalindrom(int x) {
		if (x < 0) {
			return false;
		}
		
		long reversed = 0;
		long temp = x;
		
		while(temp != 0) {
			int digit = (int) (temp % 10);
			reversed = reversed * 10 + digit;
			temp /= 10;
		}
		
		return (reversed == x);
	}
	
	public static void main(String [] args) {
		int a = 121;
		int b = 123;
		boolean result1 = isPalindrom(a);
		boolean result2 = isPalindrom(b);
		System.out.println(result1);
		System.out.println(result2);
	}
}
