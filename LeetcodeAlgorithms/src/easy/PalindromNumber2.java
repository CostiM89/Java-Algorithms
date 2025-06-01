package easy;

// Convert int to String and then compare the first element to the very last element, second element to second last element and so on 
// (elements at the same distance from the beginning and from the end). If they don't match is returned a False.
public class PalindromNumber2 {
	public static boolean isPalindrom(int x) {
		String s = String.valueOf(x);
		int n = s.length();
		
		for(int i=0; i<n/2; i++) {
        // Check whether the elements at the same distance from
        // beginning and from ending are same, if not return false			
			if(s.charAt(i) != s.charAt(n-i-1)) {
				return false;
			}
		}
		// if no flaws are found then return true
		return true;
	}
	
	public static void main(String [] args) {
		int a = 121;
		int b = 123;
		int c = 1221;
		boolean result1 = isPalindrom(a);
		boolean result2 = isPalindrom(b);
		boolean result3 = isPalindrom(c);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
