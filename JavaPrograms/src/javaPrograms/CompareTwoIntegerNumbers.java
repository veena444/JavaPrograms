package javaPrograms;
/*
 * Compare two Integer numbers.
 * 
 * When we compare two object references with == sign, it will always return false.
 * 
 * Integer Caching: 
 * 
 * Integer caching range is from -128 to 127.
 * 
 * For 1st case it shows both are equal,because of Integer Caching. Here both the numbers are auto boxed & it will take the actual 
 * value of num1  & num2. And it is falling within the caching range.
 * 
 * For 2nd case, it shows both are not equal because it doesn't fall in the range of Integer caching.
 * 
 * 
 */
public class CompareTwoIntegerNumbers {

	public static void main(String[] args) {
		//1. both are equal
//		Integer num1 = 100;
//		Integer num2 = 100;
//		
//		//comparing two object references
//		if(num1 == num2) {
//			System.out.println("both are equal");
//		}
//		else {
//			System.out.println("both are not equal");
//		}

		//2.both are not equal
		
		Integer num1 = 190;
		Integer num2 = 190;
		
		//comparing two object references
		if(num1 == num2) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
	}

}
