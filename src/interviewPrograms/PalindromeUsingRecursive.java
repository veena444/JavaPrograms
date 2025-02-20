package interviewPrograms;

public class PalindromeUsingRecursive {

	public static void main(String[] args) {
		int n = 123454321;
		int reverseNumber = reverseNumber(n, 0);
		System.out.println(reverseNumber);
		if(n == reverseNumber) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}
	
	public static int reverseNumber(int n, int reversed) {
		
		if(n == 0) {
			return reversed;
		}
		
		reversed = reversed * 10 + n % 10;
		
		return reverseNumber( n / 10, reversed);
		
	}

}
