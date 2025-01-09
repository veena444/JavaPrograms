package strings;

public class StringCreation {

	public static void main(String[] args) {
		String name = "Sachin";
		name.concat("Tendulkar");
		System.out.println(name); // Sachin
		
		//reassign the string
		
		name = name.concat(" Tendulkar");
		System.out.println(name);//Sachin Tendulkar

	}

}

/*

String is immutable means constant, once created we can't modify it.


*/