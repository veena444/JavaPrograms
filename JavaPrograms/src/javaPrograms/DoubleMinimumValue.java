package javaPrograms;
//What is the output of below program?
public class DoubleMinimumValue {

	public static void main(String[] args) {
		
		System.out.println(Double.MIN_VALUE);//+ve number
		System.out.println(Float.MIN_VALUE);//+ve number
		System.out.println(Integer.MIN_VALUE);//-ve number
		System.out.println(Long.MIN_VALUE);//-ve number
		System.out.println(Short.MIN_VALUE);//-ve number
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));//0.0
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f));//0.0
		System.out.println(Math.min(Integer.MIN_VALUE, 0));//-ve number
		System.out.println(Math.min(Long.MIN_VALUE, 0));//-ve number
		System.out.println(Math.min(Short.MIN_VALUE, 0));//-ve number
		
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));//-Infinity
		
	}

}
