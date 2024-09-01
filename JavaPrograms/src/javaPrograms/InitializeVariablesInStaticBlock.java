package javaPrograms;
/*
 * Can we initialize member variables within static block?
 * 
 * We can initialize member variables (non-static) within static block by creating object of the class.
 * 
 * Static variables can be initialized directly. 
 */
public class InitializeVariablesInStaticBlock {
	
	String name;
	
	static int age;
	
	static {
		//we need to create object of the class to initialize non-static variable in static block
		InitializeVariablesInStaticBlock obj = new InitializeVariablesInStaticBlock();
		obj.name="John";
		
		//we can directly initialize static variable inside static block
		age=25;
		
		System.out.println(obj.name+" "+age);
	}
	

	public static void main(String[] args) {
		

	}

}
