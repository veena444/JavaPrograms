package array;

import java.util.Arrays;

/*
 * Sort the elements of an array in an ascending order.
 */
public class SortInAscendingOrder_BubbleSort {

	public static void main(String[] args) {
		int[] nums = {-2, 0, 1, 3, -1, 2};
		sortInAscendingOrder(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	//using bubble sort
	
	public static void sortInAscendingOrder(int[] nums) {
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}

}
