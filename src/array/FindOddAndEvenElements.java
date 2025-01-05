package array;
/*
 * Find odd & even numbers from the given array.
 */
import java.util.ArrayList;
import java.util.List;

public class FindOddAndEvenElements {

	public static void main(String[] args) {
		int[] arr = {12, 7, 9, 18, 21, 4, 10};
		List<Integer> oddNumbers = new ArrayList<Integer>();
		List<Integer> evenNumbers = new ArrayList<Integer>();
		
		for(int num : arr) {
			if(num % 2 == 0) {	
				evenNumbers.add(num);
			}
			else {
				oddNumbers.add(num);
			}
		}
		
		System.out.println("Odd numbers: "+oddNumbers);
		System.out.println("Even numbers: "+evenNumbers);


	}


}
