package trickyPrograms;
/*
 * What is the output of below program?
 */
public class WhatIsOutput_6 {

	public static void main(String[] args) {
		  boolean a = true;
		  boolean b = false;
		  boolean c = a || b && !a; // true OR false AND false = false AND false 
		  System.out.println(c);//true

	}

}
