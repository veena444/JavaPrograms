package interviewPrograms;
/*
 * Given an array, print all elements & their frequencies.
 */
import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,10,50,20,10};
		int n = arr.length;
		countFrequency(arr,n);
		

	}
	
	public static void countFrequency(int[] arr,int n) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ "---->" + entry.getValue());
			
		}
	}

}
