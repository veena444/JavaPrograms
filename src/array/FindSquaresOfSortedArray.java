package array;
/*
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
public class FindSquaresOfSortedArray {

	public static void main(String[] args) {
		int nums[]= {-4,-1,0,3,10};	
		int[] squArr = sortedSquares(nums);
		for(int i=0;i<squArr.length;i++) {
			System.out.print(squArr[i]+" ");
		}
		System.out.println();

	}
	
	public static int[] sortedSquares(int[] nums) {
		int n = nums.length;
		int[] squaredArray = new int[n];
		int highestSquareIndex=n-1;
		
		int left = 0;
		int right = n-1;
		
		while(left<=right) {
			int leftSquare = nums[left] * nums[left];
			int rightSquare = nums[right] * nums[right];
			
			if(leftSquare>rightSquare) {
				squaredArray[highestSquareIndex--] = leftSquare;
				left++;
			}
			else {
				squaredArray[highestSquareIndex--] = rightSquare;
				right--;
			}
			
		}
		return squaredArray;
	}

}
