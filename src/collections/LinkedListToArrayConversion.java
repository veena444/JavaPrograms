package collections;

import java.util.LinkedList;

public class LinkedListToArrayConversion {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("LinkedList:"+list);
		System.out.println(list.size());
		
		Object[] obj = list.toArray();
		for(Object e: obj) {
			System.out.print(e+" ");
		}
		

	}

}
