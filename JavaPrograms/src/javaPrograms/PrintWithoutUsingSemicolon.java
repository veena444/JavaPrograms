package javaPrograms;
/*
 * Print 'Hello World' without using semicolon(;) 
 */
public class PrintWithoutUsingSemicolon {

	public static void main(String[] args) {
		
		//1.
		if(System.out.printf("Hello World" + " \n") == null) {
			
		}
		
		
		//2.
		if(System.out.append("Hello World" + " \n") == null) {
			
		}
		
		//3.
		if(System.out.append("Hello World" + " \n").equals(null)) {
			
		}
		
		//4.
		if(System.out.format("Hello World" + " \n") == null) {
			
		}
		
		//5. Unicode character for semicolon '\u003B'
		System.out.println("Hello World")\u003B
		
	}

}
