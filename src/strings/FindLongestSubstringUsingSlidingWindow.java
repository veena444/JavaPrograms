package strings;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubstringUsingSlidingWindow {

	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));

	}
	
	public static int lengthOfLongestSubstring(String s) {
		
		int result = 0;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		int i=0;
		int j=0;
		
		while(j<s.length()) {
			char ch = s.charAt(j);
			if(map.containsKey(ch)) {
				i = Math.max(map.get(ch), i);
			}
			result = Math.max(result, j-i+1);
			map.put(ch, j+1);
			j++;
		}
		return result;
	}

}
