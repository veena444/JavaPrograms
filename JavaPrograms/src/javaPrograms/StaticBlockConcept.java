package javaPrograms;
/*
 * Static Block:
 * 
 * When a block is associated with a static keyword is called static block.
 * 
 * JVM will execute the static block first time when the class is loaded into the memory even before calling the main method. It is executed only once.
 * 
 * If we have multiple static blocks, it will execute the blocks in the same sequence.
 */
public class StaticBlockConcept {
	
	static {
		System.out.println("static block 1");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	static {
		System.out.println("static block 3");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		
	}

}
