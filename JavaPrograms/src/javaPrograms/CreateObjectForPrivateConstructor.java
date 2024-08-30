package javaPrograms;
/*
 * How can we create objects if we make the constructor private?
 * 
 * If the constructor is private, one way is ,create the static block and instantiate the object inside. No need to call the static block since it will be 
 * called automatically.
 * 
 * Second way is ,create the static method and instantiate the object inside. Using className we can call the static method in another class.
 */
public class CreateObjectForPrivateConstructor {
	
	int age;
	
	//private constructor
	private CreateObjectForPrivateConstructor() {
		age = 30;
	}

	//static block
	static {
		CreateObjectForPrivateConstructor obj = new CreateObjectForPrivateConstructor();
		obj.age=35;
		System.out.println(obj.age);
	}
	
	//static method
	
	public static int createObject() {
		CreateObjectForPrivateConstructor obj = new CreateObjectForPrivateConstructor();
		obj.age=40;
		return obj.age;
	}
	
	public static void main(String[] args) {
		
		//can call private constructor in same class
		CreateObjectForPrivateConstructor obj = new CreateObjectForPrivateConstructor();
		System.out.println(obj.age);//30

	}

}
