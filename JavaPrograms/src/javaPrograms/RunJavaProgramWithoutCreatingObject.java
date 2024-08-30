package javaPrograms;
/*
 * How to run a Java program without creating any object?
 * 
 * static block will be executed before main method. We can call static method directly or with the className without creating the object.
 */
public class RunJavaProgramWithoutCreatingObject {
	
	static {
		System.out.println("static block");
	}
	
	public static void test() {
		System.out.println("test method");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		test();

	}

}
