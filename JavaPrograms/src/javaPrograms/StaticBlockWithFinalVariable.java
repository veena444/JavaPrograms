package javaPrograms;
/*
 * What is the output of the program?
 * 
 * Here x is declared as final. To improve the performance, Java will replace Main.x with 100 in .class file directly.
 * If the variable is final, then it won't even load the Main class, just replaces the Main.x with 100 internally.
 * 
 * In case of x is not being final, first it will execute the static block then it will print 100.
 */
public class StaticBlockWithFinalVariable {

	public static void main(String[] args) {
		System.out.println(Main.x);//100
		
	}

}
  

class Main{
	
	public static final int x = 100;
	
	static {
		System.out.println("static bloc of Main class");
	}
}