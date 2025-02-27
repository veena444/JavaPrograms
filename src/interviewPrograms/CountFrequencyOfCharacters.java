package interviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfCharacters {

	public static void main(String[] args) {
		String str = "Veena";
		countFrequency(str);
	}
	
	public static void countFrequency(String str) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		for(char c: ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) +1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry entry: map.entrySet()) {
			System.out.println(entry.getKey() + " "+entry.getValue());
		}
	}


}
