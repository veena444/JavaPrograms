package array;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array, print all elements & their frequencies.
 */
public class CountFrequencyOfArray {

	public static void main(String[] args) {
		int[] nums = {10,20,10,30,20,10};
		int n = nums.length;
		countFreqency(nums,n);

	}
	
	public static void countFreqency(int[] nums, int n)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		//traverse through array elements & count frequencies
		for(int i=0;i<n;i++) {
			if(map.containsKey(nums[i])) {
				//if num is present, increment its count by 1
				map.put(nums[i], map.get(nums[i])+1);
			}
			else {
				//if num is not present, set the count by 1
				map.put(nums[i], 1);
			}
		}
		
		//traverse through map & print frequencies
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
