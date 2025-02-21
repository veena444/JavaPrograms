package array;
/*
 * Find the given array is sorted or not.
 */
public class ArrayIsSorted {

	public static void main(String[] args) {
		int[] nums = {10,30,50,20,40};
		int n = nums.length;
		System.out.println(ifSorted(nums,n));

	}
	
	public static boolean ifSorted(int[] nums, int n) {
		if(n == 0 || n == 1) {
			return true;
		}
		for(int i=1;i<n;i++) {
			if(nums[i-1] > nums[i]) {
				return false;
			}			
		}
		return true;
	}

}
