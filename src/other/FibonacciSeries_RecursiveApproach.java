package other;
/*
 * Find the Fibonacci series using recursive approach.
 */
public class FibonacciSeries_RecursiveApproach {

	public static void main(String[] args) {
		int n = 4;
		for(int i=0;i<n;i++) {
			System.out.print(findFibonacci(i)+" "); 
		}

	}
	
	public static int findFibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return findFibonacci(n-1) + findFibonacci(n-2);
	}

}
