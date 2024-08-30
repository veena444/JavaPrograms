package javaPrograms;
/*
 * How many String objects will be created?
 * 
 * String is a sequence of characters. Strings are immutable means a constant, once created cann't be changed.
 *   
 * We can create String in two ways,using String literal and new keyword.
 * 
 * String literals: 
 * 
 * String s1 = "Hello";
 * When we create string using String Literal, it will create one object and it will be stored in String Constant Pool(SCP) and s1 reference will
 * be stored in 'Stack'. Next time, when we create
 * String s2 ="Hello", no new object will be created since 'Hello' is already present in SCP, s2 reference will be stored in 'Stack' and both s1 & s2 are
 * pointing to 'Hello'..
 * SCP doesn't allow duplicate values.
 * 
 * Using new Keyword: 
 * 
 * String str = new String("Hello World");
 * When we create string using new keyword, two objects will be created, one object is stored in 'Heap' and 2nd object is stored in SCP which is part of
 * 'Heap', str object reference will be stored in 'Stack'.
 */
public class StringObjectCreation {

	public static void main(String[] args) {
		
		//Here Java will create two objects. One in 'Heap' and 2nd one in 'String Constant Pool' which is part of 'Heap'.
		//str reference will be stored in 'Stack'.
//		String str = new String("New World!");
		
		
		String s1 = "Hello World";//one object in 'SCP', s1 in 'Stack'
		String s2 = "Hello World";//no new object, s2 in 'Stack'
		String s3 = s1;//no object, s3 in 'Stack'
		
		String n1 = new String("Hello World");//1 object will be created, one in 'Heap', since 'Hello World' is already present in 'SCP' it won't create
		//again, n1 reference will be stored in 'Stack'.
		String n2 = new String("Hello World");//1 object will be created, one in 'Heap', since 'Hello World' is already present in 'SCP' it won't create
		//again, n2 reference will be stored in 'Stack'.
		
		// here 3 objects will be created.
		
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//true
		System.out.println(s3==s1);//true
		
		System.out.println(n1==n2);//false, comparing object references

	}

}
