package trickyPrograms;
/*
 * What is the output of below program?
 */
public class StringIntern {

	public static void main(String[] args) {
		  String s1 = new String("xyz");
		  String s2 = "xyz";
		  System.out.println(s1.intern() == s2);//true

	}

}
