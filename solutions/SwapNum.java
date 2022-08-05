/**
 * Swap two numbers without third variable
 */

public class SwapNum {

    public static void main(String[] args) {
	
	int a =7, b = 8; 
	
	a = a + b; // => 15 
	b = a - b; // 15 - 8 => 7 
	a = a - b; // 15 - 7 => 8 
	System.out.println(a);
	System.out.println(b);
    }

}
