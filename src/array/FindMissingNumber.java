package array;
/*
 * Given an array arr[] of size n-1 with integers in the range of [1, n], the task is to find the missing number from the first n integers.
 * 
 * Examples: 

Input: arr[] = [1, 2, 4, 6, 3, 7, 8] , n = 8
Output: 5
Explanation: Here the size of the array is 8, so the range will be [1, 8]. The missing number between 1 to 8 is 5


Input: arr[] = [1, 2, 3, 5], n = 5
Output: 4
Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
 */
public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5};
		System.out.println(missingNumber(arr));

	}
	
	public static int missingNumber(int[] arr) {
		int sum = 0;
		int n = arr.length + 1;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum +arr[i];
		}
		
		int expectedSum = (n * (n+1)) / 2;
		return expectedSum - sum;
	}

}
