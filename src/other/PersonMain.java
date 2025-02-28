package other;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("Veena",30);
		//call copy constructor
		
		Person p2 = new Person(p);
		
		System.out.println(p2);

	}

}
