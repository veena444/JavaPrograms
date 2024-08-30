package javaPrograms;
/*
 * Pass null argument with method overloading with String and Object types.
 * 
 * Object is a parent class, String is a child class Object class. Both Object & String will accept 'null' argument.
 * In Method Overloading, compiler will give preference to child class when compared with parent class. 
 * 
 *  If you want to call the Object class overloaded method , we can do the explicit casting and call the mthod.
 */
public class NullArgumentWithMethodOverloading {
	
	
	public static void main(String[] args) {
		test(null);//String argument
		test((Object)null);//Object argument
		
	}

   public static void test(Object o) {
	     System.out.println("Object argument");
       }
   

   public static void test(String s) {
	     System.out.println("String argument");
       }

}
