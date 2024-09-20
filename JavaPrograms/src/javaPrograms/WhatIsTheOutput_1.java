package javaPrograms;
/*
 * What will be the output of executing following class?
 * 
 * Ans: static block
 *      Main method
 * 
 * Static block will be executed when we load the class for the first time followed by main method will be executed and prints 'Main method'.
 * 
 * Instance initialization blocks & constructors are executed only when an instance of the class is created.
 * 
 * When we create the object of the class, then 'Instance initialization block' will be executed first before the constructor. 
 */
public class WhatIsTheOutput_1 {
	
	static {
		System.out.println("static block");
	}
	//instance initialization block
	{
		System.out.println("Instance Initialization Block");
	}

	WhatIsTheOutput_1(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
//		new WhatIsTheOutput_1();

	}

}
