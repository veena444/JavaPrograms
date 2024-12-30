package trickyPrograms;
/*
 * What is the output of below program?
 */
public class TernaryOperator {

	public static void main(String[] args) {
		int x = 10;
		int y=(x>5)?(x<10 ? 1:2) :3;
		System.out.println(y);

	}

}

/*
 * ternary operator syntax: condition ? true_value : false_value
 * x=10
 * x>5 , 10>5 => true
 * 1st operation, x<10, 10<10 =>false,2
 * y=2
 */
