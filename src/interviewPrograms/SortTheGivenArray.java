package interviewPrograms;

import java.util.Arrays;

public class SortTheGivenArray {

	public static void main(String[] args) {
		int[] arr = {0,2,9,4,0,6,7,8,0,1};
		sortArray(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	//using bubble sort
	public static void sortArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] =arr[j];
					arr[j]=temp;				
				}
			}
		}
	}

}
