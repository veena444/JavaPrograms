package array;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Find duplicates elements in an given array.
 */
public class FindDuplicates_HashSet {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 2, 5, 3, 6};
		findDuplicates(nums);

	}
	//using HashSet
	
	public static void findDuplicates(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(!set.add(nums[i])) {
				System.out.println(nums[i]);
			}
		}
	}

}
