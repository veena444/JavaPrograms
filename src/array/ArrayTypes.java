package array;

import java.util.Arrays;

public class ArrayTypes {

	public static void main(String[] args) {
		// single dimensional array
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		
		
		//multi-dimensional array: 2D array
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		//print 2D array
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//multi-dimensional array: 3D array
		
		int[][][] arr2 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		//print 3D array
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				for(int k=0;k<arr2.length;k++) {
					System.out.print(arr2[i][j][k]+" ");
				}
				System.out.println();
			}
		}

	}

}
