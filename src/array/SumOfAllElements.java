package array;
/*
 * Find sum of all elements in an given array.
 */
public class SumOfAllElements {

	public static void main(String[] args) {
		int[] nums= {10,20,-30,40};
		System.out.println(sumOfArray(nums));

	}
	
	public static int sumOfArray(int[] nums) {
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum = sum+nums[i];
		}
		return sum;
	}

}
