package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		//create TreeSet & add elements
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Cat");
		set.add("Dog");
		set.add("Tiger");
		set.add("Cat");
		set.add("Dog");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
