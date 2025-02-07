package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverseUsingCollections {

	public static void main(String[] args) {
		String str = "Hello";
		char[] ch = str.toCharArray();
		
		List<Character> li = new ArrayList<Character>();
		for(char e : ch) {
			li.add(e);		
		}
		Collections.reverse(li);
		
		ListIterator<Character> it = li.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}

	}

}
