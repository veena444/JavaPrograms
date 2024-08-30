package javaPrograms;

public class TestPrivateConstructor {

	public static void main(String[] args) {
		
		//static block will be executed first , it gets executed automatically & prints age=35
		//we can call the static method in another class using className
		
		int i = CreateObjectForPrivateConstructor.createObject();
		System.out.println(i);//40

	}

}
