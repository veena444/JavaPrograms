package interviewPrograms;

public class Find2ndSmallestNumber {

	public static void main(String[] args) {
		int[] arr = {1,5,3,8,4,9,7,6};
		System.out.println(findSecondSmallest(arr));

	}
	
	public static int findSecondSmallest(int[] arr) {
		int smallest = arr[0];
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] != smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
		
	}

}
