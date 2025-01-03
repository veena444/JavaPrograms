package array;
/*
 * Given an array find the smallest element in it.
 */
public class FindSmallestElementInArray {

	public static void main(String[] args) {
		int[] nums = {1,5,-9,12,0,8,4,25};
		System.out.println(findSmallest(nums));

	}
	
	public static int findSmallest(int[] nums) {
		int min = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]< min) {
				min=nums[i];
			}
		}
		return min;
	}

}
