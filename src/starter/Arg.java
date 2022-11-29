/**
 * Program demonstration of command line arguments 
 * through parsing values of Integer 
 */
package starter;

public class Arg {

	public static void main(String[] args) {
		// try..catch resource //
		try { 
		int a = Integer.parseInt(args[0]); 
		int b = Integer.parseInt(args[1]); 
		int res = a + b; 
		System.out.println(res);
		}
		catch(NumberFormatException ne) {
			System.out.print(ne);
		}

	}

}
