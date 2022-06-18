package Operators;

public class RelationalOperator {

	int x = 30;
	float y = 50.5F;
	int z = 60;

	void compare() {
		if (y > x) {
			System.out.println("y is greater than x");
		} else {
			System.out.println("y is less than x");
		}
		if (y < z) {
			System.out.println("y is less than z");
		} else {
			System.out.println("y is greater than z");
		}
	}

	public static void main(String[] args) {
		// Create an object of class.
		RelationalOperator t = new RelationalOperator();
		t.compare(); // Calling compare method using reference variable t.
	}
}

