package interviewPrograms;

public class StringManipulation {

	public static void main(String[] args) {
		String result = test("Test");
		System.out.println("test output:"+result);//defxyzpar, Testxyzpar(when a is commented)
		result = test1("Test");
		System.out.println("test output1:"+result);

	}
	
	public static String test(String a) {
	//	 a = "def";
		 String b = a.concat("xyz");
		 b = b.concat("par");
		 return b;
	}
	
	public static String test1(String a) {
		try {
			a = "abc";
			StringBuffer b = new StringBuffer();
			b = b.append(a).append("xyz");
			b = b.append("par");
			return b.toString();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		finally {
			
		}
	}

}
//1st case:
//test() - initially a = Test, but reassigns it to 'def'.
//def.concat("xyz") -> defxyz
//defxyz.concat("par") -> defxyzpar

//test1() - initially a = Test, but reassigns it to 'abc'
//StringBuffer is mutable, 
//b = abc is appended with xyz = abcxyz
//b = abcxyzpar

//2nd case
//when a is commented, initially a = Test
//b = Test.concat("xyz") -> Testxyz
//b = Testxyz.concat("par") -> Testxyzpar
