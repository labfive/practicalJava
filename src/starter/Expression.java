/**
 * Java program to return sum, division 
 */
package starter;

public class Expression {
	
	public int sum() {
		int a = -1, b = 425;
		int result = a + b - a + b * 3;
		System.out.print("Sum:");
		return result;
	}

	public boolean divide() {
		int div = 10 / 0; // 10/0 ? 
		boolean flag = true;
		// Usage of try...catch to handle Arithmetic exceptions
		try {
			if (div == 0) {
				System.out.println("Remainder:" + div);
			}
		} catch (ArithmeticException aex) {
			System.out.println("Undefined by 0");
		}
	
		return flag;
	}

	public static void main(String[] args) {
		Expression obj = new Expression();
		// Call on methods sum(), divide() //
		System.out.println(obj.sum());
		System.out.println(obj.divide());
	}

}
