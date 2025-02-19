package interviewPrograms;

import java.util.Arrays;

public class SortTheGivenArray_UsingSingleLoop {

	public static void main(String[] args) {
		int[] arr = {1, 2, 99, 9, 0, 8, 7, 6, 0, 5, 4, 3,0};
		arr = sortArray(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static int[] sortArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i = -1;
			}
		}
		return arr;
	}

}
