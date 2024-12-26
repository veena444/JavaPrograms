package other;

import java.util.HashSet;
import java.util.Set;

/*
 * Find out duplicate elements from an array.
 * 
 * 
 */
public class FindDuplicateElements {

	public static void main(String[] args) {
		
		String[] colors = {"red","green","blue","red","pink","red","green","yellow","pink"};
		Set<String> colorsSet = new HashSet<String>();
		for(int i=0;i<colors.length;i++) {
			for(int j=i+1;j<colors.length;j++) {
				if(colors[i].equals(colors[j])) {
					colorsSet.add(colors[i]);
				}
			}
		}
		System.out.println(colorsSet);		

	}

}
