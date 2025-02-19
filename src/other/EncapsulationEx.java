package other;

public class EncapsulationEx {
	
	private String name;
	private int age;
	
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void getAge() {
		System.out.println(age);
	}

}
