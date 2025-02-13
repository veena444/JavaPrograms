package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		//create LinkedHashSet & add elements
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Banana");
		set.add("Orange");
		set.add("Banana");
		set.add("Apple");
		set.add("Grapes");
		
		//traverse elements
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
