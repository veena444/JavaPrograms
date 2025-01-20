package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortElements {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		
		Collections.addAll(li, "Banana","Mango","Apple","Kiwi","Guava");
		
		//sort in ascending order
		
		Collections.sort(li);
		
		//print values
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i) + " ");
		}
		
		//sort in descending order
		
		Collections.sort(li, Collections.reverseOrder());
		
		//print values
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i) + " ");
		}

	}

}

