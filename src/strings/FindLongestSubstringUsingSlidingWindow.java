package strings;
/**
 * Given a string s having lowercase characters, find the length of the longest substring without repeating characters.
 * 
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
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
