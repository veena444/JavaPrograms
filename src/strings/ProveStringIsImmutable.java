package strings;

public class ProveStringIsImmutable {

	public static void main(String[] args) {
		String name = "Rahul";
		name.concat("Dravid");
		System.out.println(name);

	}

}

//Instead of printing Rahul Dravid, it is printing Rahul because strings are immutable.