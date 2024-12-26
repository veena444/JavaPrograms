package array;

import java.util.Arrays;

public class ArraySizeIterate {

	public static void main(String[] args) {
		
		//1.array initialization
		int[] arr = {10,20,30,40,50};
		
		//size of an array		
		int n = arr.length;
		System.out.println("Size is: "+n);
		
		//traversing array
		for(int i =0 ;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//2.array initialization
		
		int[] arr1 = new int[5];
		for(int i=0;i<arr1.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	

	}

}
