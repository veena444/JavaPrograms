package trickyPrograms;
/*
 * What is the output of below program?
 */
public class WhatIsOutput_10 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		  for (int num : nums) {
		   if (num % 2 == 0) {
		    continue;
		   }
		   System.out.print(num + " ");
		  }

	}

}

/*
i=0, 1%2 !=0 , num=1
i=1, 2%2 = 0 ,continue
i=2, 3%2 != 0 , num=3
i=3, 4%2 = 0, continue
i=4, 5%2 != 0, num=5

num = 1 3 5
*/