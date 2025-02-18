package interviewPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicates_LinkedHashSet {

	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(arr);
		

	}
	
	public static void removeDuplicates(int[] arr) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.print(set);
	}

}
