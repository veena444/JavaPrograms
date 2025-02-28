package other;

public class Car {
	
	public Car() {
		this(5);
		System.out.println("default constructor");
	}
	
	public Car(int x) {
		this(5,10);
		System.out.println(x);
	}
	
	public Car(int x, int y) {
		System.out.println( x + y);
	}
		

}
