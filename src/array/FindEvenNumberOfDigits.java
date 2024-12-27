package array;
/*
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * 
 * Ans: to find the length, convert each number into String by using Integer.toString() method
        then divide the length of converted string by 2, if the remainder is zero, it is even
 */
public class FindEvenNumberOfDigits {

	public static void main(String[] args) {
		int[] nums = {25,123,698,1236,85,532};
		System.out.println(findEvenDigits(nums));

	}
	
	public static int findEvenDigits(int[] nums) {
		int count = 0;
		if(nums.length != 0) {
			String strNum;
			for(int i=0;i<nums.length;i++) {
				strNum = Integer.toString(nums[i]);
				if( strNum.length() % 2 == 0 ) {
					count++;
				}
				
			}
		}
		return count;
	}

}
