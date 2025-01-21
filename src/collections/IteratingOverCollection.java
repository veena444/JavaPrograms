package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratingOverCollection {

	public static void main(String[] args) {
		Collection<String> co = new LinkedList<>();
		
		co.add("Asia");
		co.add("India");
		co.add("Karnataka");
		co.add("Bengaluru");
		
		Iterator<String> it = co.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}

	}

}
