package trickyPrograms;
/*
 * What is the output of below program?
 */
public class WhatIsOutput_9 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		  int sum = 0;
		  for (int i = 0; i < arr.length; i++) {
		   sum += (arr[i] % 2 == 0) ? arr[i] : 0; 
		  }
		  System.out.println(sum);

	}

}

/*
terary operator checks if the current element arr[i] is even
if the element is even(arr[i] % 2 ==0), it adds element to sum
if the element is not even, it adds '0' to sum

sum = sum + (arr[i] %2 == 0) ? arr[i]:0;
i=0, arr[i]=1, 1%2 != 0 , false, sum=0 
i=1, arr[i]=2, 2%2=0, true, sum=2
i=2, arr[i]=3, 3%2 !=0 , false , sum=2+0 = 2
i=3, arr[i]=4, 4%2=0, true, sum=4+2 = 6
i=4, arr[i]=5, 5%2 !=0 , false , sum = 6+0 =6
sum=6

*/