package interviewPrograms;

import java.util.Arrays;

/*
 * Given an array arr[] of integers, the task is to move all the zeros to the front of the array while preserving the order of non-zero elements. 
 * Modify the given array in place.
 */
public class MoveAllZerosToBeginningOfAnArray {

	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 0, 3, 0};
		moveZerosToFront(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void moveZerosToFront(int[] arr) {
		int n = arr.length;
		int count = n-1;
		
		for(int i=n-1;i>=0;i--) {
			if(arr[i] != 0) {
				arr[count--] = arr[i];
			}
		}
		while(count >= 0) {
			arr[count--] = 0;
		}
		
	}

}
