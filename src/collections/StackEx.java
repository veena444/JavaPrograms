package collections;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("Delhi");
		stack.push("Karnataka");
		stack.push("Bihar");
		stack.push("Rajastan");
		
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
						
		}
		stack.pop();

	}

}
