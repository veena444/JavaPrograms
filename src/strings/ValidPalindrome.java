package strings;
/*
 * Verify given string is palindrome or not.
 */
public class ValidPalindrome {

	public static void main(String[] args) {
		String str = "Mom";
		System.out.println(isPalindrome(str));

	}
	
	public static boolean isPalindrome(String str) {
		str = str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		int i = 0;
		int j = str.length()-1;
		
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
