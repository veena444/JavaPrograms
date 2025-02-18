package interviewPrograms;

import java.util.HashMap;

public class RemoveDuplicates_HashMap {

	public static void main(String[] args) {
		int[] arr = {1,2,5,1,6,1,2,4,3};
		removeDuplicates(arr);
	}
	
	public static void removeDuplicates(int[] arr) {
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i]) == null) {
				System.out.print(arr[i]+" ");
				map.put(arr[i], true);
			}
		}
	}

}
