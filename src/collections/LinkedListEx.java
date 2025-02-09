package collections;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("India");
		list.add("North India");
		list.add("Delhi");
		list.addLast("Agra");
		
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);

	}

}
