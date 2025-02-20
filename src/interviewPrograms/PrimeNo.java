package interviewPrograms;

public class PrimeNo {

	public static void main(String[] args) {
		int n = 1;
		System.out.println(isPrime(n));

	}
	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		
		if( n==2 || n==3) {
			return true;
		}
		
		if(n % 2 == 0) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
		
	}

}
