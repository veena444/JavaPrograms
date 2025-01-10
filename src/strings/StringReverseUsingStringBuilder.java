package strings;
/*
 * Reverse a string using StringBuilder.
 */
public class StringReverseUsingStringBuilder {

	public static void main(String[] args) {
		String str = "Good Morning";
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);

	}

}
