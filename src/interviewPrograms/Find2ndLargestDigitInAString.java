package interviewPrograms;

import java.util.TreeSet;

/*
 * Find the 2nd largest digit in a string.
 */
public class Find2ndLargestDigitInAString {

	public static void main(String[] args) {
		String str = "str1025rts";
		

	}
	
	public static int find2ndLargest(String str) {
		TreeSet<Integer> digits = new TreeSet<>();
		for(char ch: str.toCharArray()) {
			if(Character.isDigit(ch)) {
				digits.add(ch - '0');
			}		
		}
		if(digits.size() < 2) {
			return -1;
		}
		digits.pollLast();
		return digits.last();
	}

}
