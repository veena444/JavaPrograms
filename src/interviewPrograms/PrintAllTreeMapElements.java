package interviewPrograms;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PrintAllTreeMapElements {

	public static void main(String[] args) {
		//create TreeMap 
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		
		//add objects to TreeMap
		map.put(1, "Adam");
		map.put(2, "Peter");
		map.put(3, "Katy");
		map.put(4, "John");
		map.put(5, "Rose");
		

		for(Map.Entry<Integer,String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		

	}

}
