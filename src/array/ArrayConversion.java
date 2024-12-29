package array;
/*
 * Convert the given array into particular string.
 */
public class ArrayConversion {

	public static void main(String[] args) {
		String[] arr = {"t","r","v"};
		
		//convert trv, t;r;v & t|r|v
		
		String output = String.join("", arr);
		System.out.println(output);
		
		String output1 = String.join(";", arr);
		System.out.println(output1);
		
		String output2 = String.join("|", arr);
		System.out.println(output2);

	}

}
