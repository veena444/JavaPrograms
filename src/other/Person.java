package other;

public class Person {
	
	private String name;
	private int age;
	
	//constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//copy constructor
	public Person(Person another) {
		this(another.name, another.age);
	}
	
	@Override
	public String toString() {
		return name +" " + age;
	}

}
