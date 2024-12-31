package trickyPrograms;
/*
 * What is the output of below program?
 */
public class WhatIsOutput_7 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		if((a = 3) == b){
			System.out.println(a);
		}
		else {
			System.out.println(a+b);
		}


	}

}
/*
initially a=5,b=10
reassign a=3
3 != 10  >> false
goes to else part 3+10 =13

*/