package other;

public class StringInternConcept {

	public static void main(String[] args) {
		//s1 refers to object in the Heap area
		String s1 = new String("Hello");
		
		//s2 refers to object in the String Constant Pool
		String s2 = s1.intern();
		
		System.out.println(s1 == s2); //false, comparing memory location
		
		System.out.println(s1.equals(s2));//true, comparing contents
		
		//s3 refers to object in the SCP
		String s3 = "Hello";
		
		System.out.println(s2 == s3);//true

	}

}
