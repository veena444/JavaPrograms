package strings;
/*
 * Reverse a given string.
 */
public class ReverseAString {

	public static void main(String[] args) {
		
		String str = "Veena";
		String strReverse = "";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			strReverse = ch + strReverse;
		}
		System.out.println(strReverse);

	}
	

}
