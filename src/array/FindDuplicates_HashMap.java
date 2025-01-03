package array;

import java.util.HashMap;
import java.util.Map;

/*
 * Find duplicates elements in an given array.
 */
public class FindDuplicates_HashMap {

	public static void main(String[] args) {
		int[] nums= {1, 2, 3, 4, 2, 5, 3, 6};
		
		findDuplicates(nums);
	}
	
	//using HashMap
	
	public static void findDuplicates(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}
			else {
				map.put(nums[i], 1);
			}
		}
		
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}

		}
	}

}
