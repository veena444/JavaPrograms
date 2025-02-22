package interviewPrograms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minimumIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minimumIndex]) {
					minimumIndex = j;
				}
			}
			
			int temp =arr[i];
			arr[i] = arr[minimumIndex];
			arr[minimumIndex] = temp;
		}
	}

}
