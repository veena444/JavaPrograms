package other;

public class RectangleMain {

	public static void main(String[] args) {
		Shape sh = new Rectangle(2,3,"Rectangle");
		System.out.println(sh.area());
		sh.moveTo(1, 2);
		System.out.println();

	}

}
