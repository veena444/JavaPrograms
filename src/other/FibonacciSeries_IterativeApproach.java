package other;
/*
 * Find the Fibonacci series using iterative approach.
 */
public class FibonacciSeries_IterativeApproach {

	public static void main(String[] args) {
		int n = 5;
		findFibonacci(n);
		System.out.print(n);

	}
	
	public static void findFibonacci(int n) {
		int num1 = 0;
		int num2 = 1;
		
		for(int i=0;i<n;i++) {
			System.out.print(num1+" ");
			int num3 = num1+num2;
			num1 = num2;
			num2 = num3;
		}
		

	}

}
