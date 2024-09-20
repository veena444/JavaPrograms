package javaPrograms;

/*
 * What is the output of below program?
 * 
 * Ans: 20
 * 
 * In Java, static blocks are executed when the class is loaded first. Here, value of x is static and final, it will be stored in Common Memory
 * Allocation. So compiler knows the value of 'x' before even loading the class, so static block will not be executed.
 */
class Test{
	
	static {
		System.out.println("Test--static block");
	}
	public static final int x =20;
}
public class WhatIsTheOutput {

	public static void main(String[] args) {
		System.out.println(Test.x);

	}

}
