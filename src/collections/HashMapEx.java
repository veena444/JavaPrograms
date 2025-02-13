package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		//create HashMap & add elements
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, null);
		map.put(4, "Peach");
		map.put(5, "Apple");
		
		//traversing through map
		
		for(Map.Entry<Integer,String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
