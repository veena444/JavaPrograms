package array;
/*
 * Reverse the given array.
 */
import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] nums = { 1,2,3,4,5};
		reverseArray(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	//using two-pointer approach
	public static void reverseArray(int[] nums) {
		int left = 0;
		int right = nums.length-1;
		while(left<right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
			
		}

		
	}

}
