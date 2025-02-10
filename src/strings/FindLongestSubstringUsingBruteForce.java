package strings;

import java.util.HashMap;
import java.util.HashSet;

/*
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


Substring: Any portion of the string which is consecutive in nature.
 */
public class FindLongestSubstringUsingBruteForce {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));

	}
	
	
	
	public static int lengthOfLongestSubstring(String s) {
		int result = 0;
		for(int i = 0;i<s.length();i++) {
			for(int j = i;j<s.length();j++) {
				if(isUniqueWithinRange(s,i,j)) {
					result = Math.max(result, j-i+1);
				}
			}
		}
		return result;

		
	}
	
	public static boolean isUniqueWithinRange(String s, int start, int end) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i=start;i<=end;i++) {
			char ch = s.charAt(i);
			if(set.contains(ch)) {
				return false;
			}
			set.add(ch);
		}
		return true;
	}

}
