package array;

import java.util.HashMap;

/*
 * Given an array of integers. All numbers occur twice except one number which occurs once. Find the number in O(n) time & constant extra space.
 */
public class FindANumberThatAppearsOnce {

	public static void main(String[] args) {
		int[] nums= {1,2,1};
		int result = getSingleElement(nums);
		if( result != -1) {
			System.out.println("The first number that appears once is: "+result);
		}
		else {
			System.out.println("No single occurrence number found");
		}

	}
	
	public static int getSingleElement(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int count = 0;
			for(int j=0;j<nums.length;j++) {
				if(nums[i] == nums[j]) {
					count++;
				}
			}
			//check if the count of the current element is exactly 1
			if(count == 1) {
				return nums[i];
			}
		}
		//return -1 if no such element exists
		return -1;
	}
	

}
