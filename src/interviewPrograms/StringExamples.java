package interviewPrograms;

public class StringExamples {

	public static void main(String[] args) {
		String str = "Good Morning";
		System.out.println(str.indexOf('M'));//5
		
		System.out.println(str.indexOf('m'));//-1
		
		System.out.println(str.indexOf('o', 5));//6
		
		System.out.println(str.substring(0));//Good Morning
		System.out.println(str.substring(1));//ood Morning
		System.out.println(str.substring(2));//od Morning
		System.out.println(str.substring(3));//d Morning
		
		
		System.out.println(str.substring(4)); // Morning
		
		System.out.println(str.substring(1,3));//oo
		
		String str1 = "This is my testing code";
		System.out.println(str1.substring(3));//s is my testing code
		
		String str3 = "Your order 12345 is generated successfully";
		
		System.out.println(str3.length());
		System.out.println(str3.substring(11, 16));
		String output = str3.substring(str3.indexOf("order")+6, str3.indexOf("i")-1);
		System.out.println(output);

	}

}
