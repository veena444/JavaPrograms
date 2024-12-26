package array;

import java.util.Scanner;

public class Create2DArrayWithUserInput {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter no. of rows: ");
		int row = scn.nextInt();
		
		System.out.println("Enter no. of columns: ");
		int col = scn.nextInt();
		
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++){
				arr[i][j]=(i+1)*(j+1);
			}
		}
		
		//print elements of array
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scn.close();

	}

}
