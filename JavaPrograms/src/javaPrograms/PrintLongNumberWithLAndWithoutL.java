package javaPrograms;
/*What is the output of below program when you use a long number with L and without L suffix?

*/
public class PrintLongNumberWithLAndWithoutL {

	public static void main(String[] args) {
		
		long longNumberWithoutL = 1000*60*60*24*365;
		System.out.println(longNumberWithoutL);//1471228928
		
		long longNumberWithL = 1000*60*60*24*365L;
		System.out.println(longNumberWithL);//31536000000
		
		
		//When we calculate using calculator, we will get : 31,53,60,00,000 --it is a 36 bits representation
		
		//when we convert from Decimal to Binary : 11101010111101100010010110000000000
		
		//maximum limit of 32 bit of Integer is : 2147483637
		//31536000000 is crossing the 32 bit Integer limit, so Java will truncate the most significant bits
		
		//1010111101100010010110000000000 --> 1471228928

	}

}
