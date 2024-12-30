package trickyPrograms;
/*
 * What is the output of below code?
 */
public class InstanceOf {

	public static void main(String[] args) {
		String str = null;
		if(str instanceof String) {
			System.out.println("True");
		}
		else {
			System.out.println("False"); //False
		}

	}

}

/*
instanceof operator checks whether the str object is an instance of the 'String' class. 
'null' does not refer to any object, so it can't be instance of any class. So output is 'False'.

*/