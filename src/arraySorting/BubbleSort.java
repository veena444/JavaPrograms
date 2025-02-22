package arraySorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,6,3,1,8,4,0,2,7,0};
		arraySort(arr);
		System.out.println(Arrays.toString(arr));
		
		

	}
	
	public static void arraySort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}	
		
	}

}
