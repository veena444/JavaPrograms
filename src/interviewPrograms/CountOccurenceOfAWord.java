package interviewPrograms;

public class CountOccurenceOfAWord {

	public static void main(String[] args) {
		String sentence = "Java is fun and Java is powerful. Java is also versatile";
		String word = "Java";
		System.out.println(countOccurence(sentence,word));

	}
	
	public static int countOccurence(String sentence, String word) {
		if( sentence == null || word == null || word.isEmpty()) {
			return 0;
		}
		
		String[] words = sentence.split("\\s+");
		int count = 0;
		
		for(String w : words) {
			if(w.equalsIgnoreCase(word)) {
				count++;
			}
		}
		return count;
	}

}
