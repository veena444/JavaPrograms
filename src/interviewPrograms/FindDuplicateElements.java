package interviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElements {

	public static void main(String[] args) {
		int[] arr = {1,2,5,1,6,2,8,9};
		findDuplicates(arr);
		System.out.println(arr);

	}
	
	public static void findDuplicates(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
