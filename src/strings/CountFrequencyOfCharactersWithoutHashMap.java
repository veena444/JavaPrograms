package strings;
/*
 * Write a Java Program to calculate frequency of each character of string without using HashMap.
 */
public class CountFrequencyOfCharactersWithoutHashMap {

	public static void main(String[] args) {
		String s = "Good Morning";
		calculateFrequency(s);
		System.out.println(s);

	}
	
	
	public static void calculateFrequency(String s) {
		int[] frequency = new int[256];
		boolean[] visited = new boolean[256];
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			frequency[ch]++;
		}
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(!visited[ch] && ch != ' ') {
				System.out.println(ch+" -> "+frequency[ch]);
				visited[ch] = true;
			}
		}
	}

}
