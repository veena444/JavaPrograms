package array;

public class ArraySizeIterate {

	public static void main(String[] args) {
		
		//array initialization
		int[] arr = {10,20,30,40,50};
		
		//size of an array		
		int n = arr.length;
		System.out.println("Size is: "+n);
		
		//traversing array
		for(int i =0 ;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
