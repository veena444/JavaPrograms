package trickyPrograms;
/*
 * What is the output of below program?
 */
public class StringReplace {

	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";
		a = a.replace("p", "b");//abble
		System.out.println(a + b);//abbleapple

	}

}
