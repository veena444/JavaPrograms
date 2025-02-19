package interviewPrograms;
/*
 * Find the Fibonacci series using recursive approach.
 */
public class FibonacciSeriesUsingRecursive {

	public static void main(String[] args) {
		int n=2;
		for(int i=0;i<n;i++) {
			System.out.print(findFibinacci(n) + " ");
		}

	}
	
	public static int findFibinacci(int n) {
		if(n<=1) {
			return n;
		}
		return findFibinacci(n-1) + findFibinacci(n-2);
	}

}
