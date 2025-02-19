package other;

public class Employee {
	
	public Employee login(String login) {
		System.out.println("Entered login");
		return this;
	}
	
	public Employee searchProduct() {
		System.out.println("Product searched");
		return this;
	}
	
	public Employee addToCart() {
		System.out.println("Item added to cart");
		return this;
	}

}
