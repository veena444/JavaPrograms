package strings;
/*
 * Reverse a string using Character Array.
 */
public class StringReverseUsingCharacterArray {
	
	public static void main(String[] args) {
		String str = "Good Morning";
		char[] arr = str.toCharArray();
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}


	}

}
