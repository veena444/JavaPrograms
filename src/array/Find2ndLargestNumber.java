package array;

import java.util.Arrays;

/*
 * Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.

Note: If the second largest element does not exist, return -1.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.


Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.


Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second largest element.
 */
public class Find2ndLargestNumber {

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
//		System.out.println(secondLargest(arr));
//		System.out.println(secondLargestElemenet(arr));
		System.out.println(findSecondLargest(arr));

	}
	
	//1.using brute force :O(n*logn+n) approach
	
	public static int secondLargest(int[] arr) {

		//sort the array in ascending order
		Arrays.sort(arr); 
		
		//start from 2nd last element as last element is the largest
		for(int i=arr.length-2;i>=0;i--) {
			//return 1st element which is not equal to the largest element
			if(arr[i] != arr[arr.length-1]) {
				return arr[i];
			}
		}
		//if no 2nd largest element was found, return -1 
		return -1;
	}
	
	//2. better approach : two pass search O(2n)
	
	public static int secondLargestElemenet(int[] arr) {
		int largest = arr[0];
		//find largest element
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest =  arr[i];
			}
		}
		//find 2nd largest element
		int secondLargest = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > secondLargest && arr[i] != largest ) {
				secondLargest =arr[i];
			}
		}
		return secondLargest;
	}
	
	//3. optimal approach: one pass search O(n)
	
	public static int findSecondLargest(int[] arr) {
		int largest =arr[0];
		int secondLargest = -1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]> largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
		
		
	}
	
	

}
