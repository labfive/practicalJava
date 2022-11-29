/** 
 * Java program to return boolean value 
 */
package starter; 

public class EvenOdd {

	public boolean isEvenOdd() {
		int num = 11; // Is 11 a odd or even number ? //
		boolean flag = false;
		if (num % 2 == 0 || num % 3 == 0) {
			flag = true;
		}
		return flag;
	}
	public static void main(String[] args) {
	
		EvenOdd obj = new EvenOdd();
		System.out.println(obj.isEvenOdd());
	}

}

