package other;

public class Rectangle extends Shape {
	
	int length, width;
	
	Rectangle(int length, int width, String objName) {
		super(objName);
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return (double)(length * width);
	}

	@Override
	public void draw() {
		System.out.println("Rectangle has been drawn");
		
	}

	
	
	

}
