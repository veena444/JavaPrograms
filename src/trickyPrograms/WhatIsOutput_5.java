package trickyPrograms;
/*
 * What is the output of below program?
 */
public class WhatIsOutput_5 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			   switch (i) {
			   case 0:
			    System.out.print("A");
			   case 1:
			    System.out.print("B");
			    break;
			   case 2:
			    System.out.print("C");
			   }
			   
			 }

	}

}

/*
i=0 , prints = AB
i=1, prints B
i=2, prints C
prints ABBC
*/