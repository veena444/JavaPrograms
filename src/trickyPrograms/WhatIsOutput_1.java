package trickyPrograms;
/*
 * What is the output of below program?
 */
public class WhatIsOutput_1 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a += (a=5) *(a/5));

	}

}

/*
a=10
a=5 ,assign a to 5
(a=5)*(a/5) = 5 * (5/5) = 5*1 = 5
a += 5+5 = 10
a = 10 +5 = 15

*/