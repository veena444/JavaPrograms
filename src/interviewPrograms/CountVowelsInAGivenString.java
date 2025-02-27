package interviewPrograms;

public class CountVowelsInAGivenString {

	public static void main(String[] args) {
		String str = "user name";
		System.out.println(countVowels(str));

	}
	
	public static int countVowels(String str){
		int count = 0;
		str = str.toLowerCase();
		
		char[] ch = str.toCharArray();
		for(char c: ch) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
				count++;
			}
		}
		return count;
		
	}

}
