package interviewPrograms;

public class ExtractIntegerFromAGivenString {

	public static void main(String[] args) {
		String str = "Hello123 Good Morni256ng";
        System.out.println(extractInteger(str));
	}
	
	public static String extractInteger(String str) {
		if(str.equals("")) {
			return  "-1";
		}
		
		//replace every non-digit character with a space
		str = str.replaceAll("[^\\d]", " ");
		System.out.println(str);
		
		//remove extra spaces from beginning & end
		str = str.trim();
		System.out.println(str);
		
		//replace all white spaces with a single space
		str = str.replaceAll(" +", " ");
		System.out.println(str);
		return str;
	}

}
