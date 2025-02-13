package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		//create ArrayList & add elements
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Banana");
		list.add("Apple");
		list.add("Papaya");
		list.add("Banana");
		
		//traversing elements
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
