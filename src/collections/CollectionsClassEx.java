package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassEx {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		
		li.add("Mango");
		li.add("Papaya");
		
		//addAll(): used to add all specified elements
		Collections.addAll(li,"Banana", "Apple","Grapes","Mango");
		for(String s: li) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		//sort the elements
		Collections.sort(li);
		for(int i=0;i<li.size();i++) {
			System.out.print(li.get(i)+" ");
		}
		
		System.out.println();
		//reverse the elements
		
		Collections.reverse(li);
		for(int i=0;i<li.size();i++) {
			System.out.print(li.get(i)+" ");
		}
	}

}
