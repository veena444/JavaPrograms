package other;

public class StringEx {

	public static void main(String[] args) {
		String str = "Good evening";
		System.out.println(str.substring(1, 10));
		
		String s ="This is your order id 1122536";
		System.out.println(s.length());
		System.out.println(s.substring(s.indexOf("id")+3, s.length()));
		

	}

}
