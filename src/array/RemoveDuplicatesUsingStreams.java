package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStreams {

	public static void main(String[] args) {
		List<Integer> originalList = new ArrayList<>(Arrays.asList(1,2,3,1,2,4,5,3,6,1,2));
		List<Integer> uniqueList = originalList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList);

	}

}
