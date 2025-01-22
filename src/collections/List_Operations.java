package collections;

import java.util.ArrayList;
import java.util.List;

public class List_Operations {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		
		//1.add elements
		li.add("Java");
		li.add("Python");
		li.add(2, "C++");
		li.add("Ruby");
		System.out.println(li);
		
		//2.update element
		li.set(2, "JavaScript");
		System.out.println(li);
		
		//3.search element
		int firstIndex = li.indexOf("Java");
		System.out.println(firstIndex);
		int lastIndex = li.lastIndexOf("Ruby");
		System.out.println(lastIndex);
		
		//4.remove element
		
		li.remove(3);
		System.out.println(li);
		
		//5.access the particular element
		
		String secondElement = li.get(1);
		System.out.println(secondElement);
		
		//6.check element is present or not
		boolean isPresent = li.contains("JavaScript");
		System.out.println(isPresent);
		boolean notPresent = li.contains("C++");
		System.out.println(notPresent);
		
	}

}


