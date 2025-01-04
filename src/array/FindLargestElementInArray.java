package array;

import java.util.Arrays;

/*
 * Given an array find the largest element in it.
 */
public class FindLargestElementInArray {

	public static void main(String[] args) {
		int[] nums = {10,2,31,4,5};
		findLargestElement(nums);
//		System.out.println(findLargest(nums));

	}
	
	//1. using brute force
	
	public static void findLargestElement(int[] nums) {
		//sort the array
		Arrays.sort(nums);		
		System.out.println(nums[nums.length-1]);	
	}
	
	//2.optimal solution
	public static int findLargest(int[] nums) {
		int max = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

}
