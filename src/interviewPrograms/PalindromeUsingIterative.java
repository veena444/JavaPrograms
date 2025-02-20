package interviewPrograms;

public class PalindromeUsingIterative {

	public static void main(String[] args) {
		int n = 12345432;
		int reverseNumber = reverseNumber(n);
		System.out.println(reverseNumber);
		if(n == reverseNumber) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		

	}
	
	public static int reverseNumber(int n) {
		int reversedNo = 0;
		while(n > 0) {
			reversedNo = reversedNo * 10 + n % 10;
			n = n / 10;
		}
		return reversedNo;
	}

}
