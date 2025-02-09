package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//add elements
		
		list.add("Hello");
		list.add("Good");
		list.add("Morning");
		
		System.out.println(list);
		
		//update element
		list.set(2, "Evening");
		System.out.println(list);
		
		
		//iterate over LinkedList
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();

	}

}
