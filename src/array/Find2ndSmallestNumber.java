package array;
/*
 * Given an array arr[] of size N, find the smallest and second smallest element in an array.
 * 
 * Examples:


Input: arr[] = {12, 13, 1, 10, 34, 1}

Output: 1 10
Explanation: The smallest element is 1 and second smallest element is 10.


Input: arr[] = {111, 13, 25, 9, 34, 1}
Output: 1 9
Explanation: The smallest element is 1 and second smallest element is 9.
 */
import java.util.Arrays;

public class Find2ndSmallestNumber {

	public static void main(String[] args) {
		int[] arr = {12, 13, 1, 10, 34, 1};
//		System.out.println(secondSmallest(arr));
//		System.out.println(secSmallest(arr));
		System.out.println(findSmallestElement(arr));

	}
	
	//1.using brute force
	
	public static int secondSmallest(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int first = arr[0];
		int second = Integer.MAX_VALUE;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != first) {
				second = arr[i];
				break;
			}
		}
		return second;
	}
	
	
	//using two pass approach
	
	public static int secSmallest(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]< smallest) {
				smallest = arr[i];			
			}
		}
		
		int secondSmallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < secondSmallest && arr[i] > smallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}
	
	//using one pass approach
	
	public static int findSmallestElement(int[] arr) {
		int smallest = arr[0];
		int secondSmallest = Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] != smallest && arr[i]<secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}

}
