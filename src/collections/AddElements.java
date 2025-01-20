package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddElements {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("David");
		li.add("John");
		
		Collections.addAll(li, "Maria","Mary","Robert");
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i) + " ");
		}
		

	}

}
