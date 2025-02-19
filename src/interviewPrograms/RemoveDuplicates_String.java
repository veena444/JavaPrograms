package interviewPrograms;

import java.util.LinkedHashSet;

/*
 * Remove duplicate elements from String array.
 */
public class RemoveDuplicates_String {

	public static void main(String[] args) {
		String[] arr = {"red","green","blue","red","pink","red","green","yellow","pink"};
		removeDuplicates(arr);
		

	}
	
	public static void removeDuplicates(String[] arr) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.print(set);
	}

}
