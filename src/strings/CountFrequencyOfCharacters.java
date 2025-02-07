package strings;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string, the task is to write a program in Java which prints the number of occurrences of each character in a string.
 */
public class CountFrequencyOfCharacters {

	public static void main(String[] args) {
		String str = "Veena";
		characterCount(str);

	}
	
	public static void characterCount(String str) {
		
		//create HashMap
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		//convert the given string to CharArray
		
		char[] strArray = str.toCharArray();
		
		//traverse to check each character
		for(char c: strArray) {
			//if char is present in map, increment its count by 1
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			//if not present, put in map with 1 as value
			else {
				map.put(c, 1);
			}
			
		}
		//print map
		
		for(Map.Entry entry: map.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
	}

}
