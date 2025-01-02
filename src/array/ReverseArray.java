package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Reverse an given array.
 */
public class ReverseArray {

	public static void main(String[] args) {
		Integer[] nums = {1,2,3,4,5};
		
		//convert array to list
		List<Integer> list = Arrays.asList(nums);
		Collections.reverse(list);
		
		//convert back to array
		nums = list.toArray(new Integer[0]);
		System.out.println("Reversed array: "+Arrays.toString(nums));

	}

}
