package javaPrograms;

import java.util.BitSet;
import java.util.stream.IntStream;

/*
 * Print 1 to 100 without using any loop or recursion.
 */
public class Print1To100WithoutUsingRecursionOrLoop {

	public static void main(String[] args) {
		
		//Using BitSet class
		
		BitSet bs = new BitSet();
		bs.set(1, 101);
		System.out.println(bs);
		
		//Using Java streams
//		IntStream.range(1, 101).forEach(e -> System.out.println(e));

	}

}
