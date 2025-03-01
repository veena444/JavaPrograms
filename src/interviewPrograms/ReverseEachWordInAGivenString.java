package interviewPrograms;
/*
 * Write a java program to reverse each word of a given string.
 */
public class ReverseEachWordInAGivenString {

	public static void main(String[] args) {
		String str = "Hello Good Morning";
		System.out.println(reverseWord(str));

	}
	
	public static String reverseWord(String str) {
		String[] words = str.split(" ");
		String reverseStr = "";
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reverseWord = "";
			for(int j = word.length()-1;j>=0;j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseStr = reverseStr + reverseWord + " ";
		}
		return reverseStr;
	}

}
