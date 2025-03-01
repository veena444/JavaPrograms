package interviewPrograms;
/*
 * Reverse a string while preserving the positions of spaces.
 */
public class ReverseString {

	public static void main(String[] args) {
		String str = "Good Morning";
		System.out.println(reverseString(str));

	}
	
	public static String reverseString(String str) {
		String reverse = "";
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			reverse = ch + reverse;
		}
		return reverse;
	}

}
