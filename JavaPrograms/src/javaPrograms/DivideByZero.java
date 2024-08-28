package javaPrograms;
/*
 * What is the output of below program?
 * 
 * System.out.println(5.0/0);
 * Ans: Infinity
 * 
 *
 * When we divide any Integer number by zero, we will get 'ArithmeticException'.
 * 
 * When we divide any floating or double number by zero, or any Integer number divide by floating 0.0, we will get 'Infinity'.
 * 
 * NaN is produced if a floating point operation has some input parameters that cause the operation to produce some undefined result.
 */
public class DivideByZero {

	public static void main(String[] args) {
		
		System.out.println(5.0/0);//Infinity
		System.out.println(12.33f/0);//Infinity
		System.out.println(10/0.0);//Infinity
		System.out.println(20.45612314522d/0);//Infinity
		
//		System.out.println(9/0);//ArithmeticException/ by zero
//		System.out.println(0/0);//ArithmeticException/ by zero
		
		System.out.println(0.0/0);//NaN(Not a Number)
		System.out.println(0.0/0.0);//NaN(Not a Number)
		System.out.println(0.0/0.0);//NaN(Not a Number)
		System.out.println(2.0 % 0);//NaN(Not a Number)
		System.out.println(Math.sqrt(-1));//NaN(Not a Number)

	}

}
