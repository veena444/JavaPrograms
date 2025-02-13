package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		//create HashSet & add elements
		HashSet<String> set = new HashSet<String>();
		
		set.add("Banana");
		set.add("Apple");
		set.add("Guava");
		set.add("Banana");
		
		
		//traversing elements
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println( iterator.next());
		}
		

	}

}
