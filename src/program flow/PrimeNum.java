/**
 * Prime number program 
 */
package programflow;

public class PrimeNum {

	public boolean isPrime() {
		int num = 8;
		boolean prime = true;
		if(num <= 1){ 
			prime = false; 
		}
		for (int i = 2; i <= num / 2; i++) {
				if(num % i == 0)
				prime = false;
		}
		
		return prime;

	}

	public static void main(String[] args) {

		PrimeNum obj = new PrimeNum();
		System.out.println(obj.isPrime());

	}

}
