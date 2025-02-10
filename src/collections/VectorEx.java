package collections;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(3, 40);
		System.out.println(v);

	}

}


//Difference between ArrayList & Vector is that, Vector is synchronized & ArrayList is non-synchronized.