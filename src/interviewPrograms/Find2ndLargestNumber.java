package interviewPrograms;

public class Find2ndLargestNumber {

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		System.out.println(findSecondLargest(arr));

	}
	
	public static int findSecondLargest(int[] arr) {
		int largest = arr[0];
		int secondLargest = -1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else {
				if(arr[i] < largest && arr[i] > secondLargest) {
					secondLargest = arr[i];
				}
			}
		}
		return secondLargest;
	}

}
