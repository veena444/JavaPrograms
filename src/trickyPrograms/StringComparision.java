package trickyPrograms;
/*
 * What is the output of below program?
 */
public class StringComparision {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2) && s1 == s2);//true && false = false

	}

}
