package other;
/*
 * Program to find whether a given number is power of 2.
 */
public class GivenNumberIsPowerOf2 {

	public static void main(String[] args) {
		int n =14;
		System.out.println(isPowerOfTwo(n));

	}
	
	public static boolean isPowerOfTwo(int n) {
		return n > 0 && (n & (n-1)) == 0;
	}

}
