package trickyPrograms;
/*
 * What is the output of the below program?
 */
public class BitwiseXOR {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		a ^= b ^= a ^= b;
		System.out.println(a + "-" + b);

	}

}
