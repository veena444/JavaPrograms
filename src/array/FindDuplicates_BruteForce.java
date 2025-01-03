package array;
/*
 * Find duplicates elements in an given array.
 */
public class FindDuplicates_BruteForce {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 2, 5, 3, 6};
		findDuplicates(nums);

	}
	
	//using brute force method
	public static void findDuplicates(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i] == nums[j]) {
					System.out.print(nums[i]+" ");
					break;
				}
			}
		}
	}

}
