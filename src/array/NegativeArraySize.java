package array;
/*
 * Can array size be negative?
 */
public class NegativeArraySize {

	public static void main(String[] args) {
		int[] a = new int[-5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int e:a) {
			System.out.println(e);//NegativeArraySizeException
		}

	

	}

}
