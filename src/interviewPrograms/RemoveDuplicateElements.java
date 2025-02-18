package interviewPrograms;

import java.util.Arrays;

/*
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 */
public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		int[] uniqueArr = removeDuplicates(arr);
		System.out.println(Arrays.toString(uniqueArr));
			

	}
	
	public static int[] removeDuplicates(int[] arr) {
		//return empty array if input is empty
		if(arr.length == 0) {
			return new int[0];
		}
		
		//start from 1 since first element is always unique
		int count = 1;
		
		for(int i=1;i<arr.length;i++) {
			//compare with previous element
			if(arr[i] != arr[i-1]) {
				arr[count] = arr[i];
				count++;
			}
		}
		//create new array with unique elements
		return Arrays.copyOf(arr, count);
		
		
	}

}
