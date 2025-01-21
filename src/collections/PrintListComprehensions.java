package collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Write a list comprehension to print a list from 1 to 10.
 */
public class PrintListComprehensions {

	public static void main(String[] args) {
		List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		System.out.println(list);

	}

}