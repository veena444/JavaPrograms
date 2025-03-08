package other;

public abstract class Shape {
	
	String objName = " ";
	
	//constructor
	Shape(String objName){
		this.objName = objName;
	}
	
	//concrete method
	public void moveTo(int x, int y) {
		System.out.println(this.objName + " has been moved to x = " + x + " and y = " + y);
	}
	
	//abstract methods
	abstract public double area();
	abstract public void draw();

}
