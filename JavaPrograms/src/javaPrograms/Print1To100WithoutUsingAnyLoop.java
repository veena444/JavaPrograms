package javaPrograms;

import java.util.stream.IntStream;

/*
 * Print from 1 to 100 without using any loop for/while/do-while.
 * 
 * We can solve it using:
 * 
 * 1.Recursive function
 * 2.Java streams
 */
public class Print1To100WithoutUsingAnyLoop {

	public static void main(String[] args) {
//		printNum(1);
//		printNumber(1,100);
		
		//using Java streams
		IntStream.range(1, 101).forEach(e -> System.out.println(e));

	}
	
	public static void printNum(int num) {
		if(num<=100) {
		System.out.println(num);
		num++;
		printNum(num); //calling the same function itself is called recursive function
		}
	}
	
	//without hard coding the values in if condition
	public static void printNumber(int startNum, int endNum) {
		if(startNum <= endNum) {
			System.out.println(startNum);
			startNum++;
			printNumber(startNum,endNum);
		}
	}

}
