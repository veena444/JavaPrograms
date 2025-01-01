package array;
/*
 * Verify two arrays are equal or not.
 */
public class VerifyTwoArraysAreEqualOrNot {

	public static void main(String[] args) {
		int[] arr1 = {4,5,6};
		int[] arr2 = {4,7,6};
		System.out.println(equalOrNot(arr1,arr2));
	}
	
	public static boolean equalOrNot(int[] arr1, int[] arr2) {
		boolean result = true;
		
		if(arr1.length == arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i] != arr2[i]) {
					result = false;
				}
			}
		}
		else {
			result = false;
		}
		return result;
	}


}
