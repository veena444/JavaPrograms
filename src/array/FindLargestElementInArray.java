package array;
/*
 * Given an array find the largest element in it.
 */
public class FindLargestElementInArray {

	public static void main(String[] args) {
		int[] nums = {10,2,31,4,5};
		System.out.println(findLargest(nums));

	}
	
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
