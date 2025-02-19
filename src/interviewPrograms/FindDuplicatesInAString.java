package interviewPrograms;

import java.util.HashSet;

public class FindDuplicatesInAString {

	public static void main(String[] args) {
		String[] arr = {"red","green","blue","red","pink","red","green","yellow","pink"};
		findDuplicates(arr);
		

	}
	
	public static void findDuplicates(String[] arr) {
		
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					set.add(arr[i]);
				}
			}
		}
		System.out.println(set);
	}

}
