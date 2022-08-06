package solution;

public class Sum {

    public int computeSum(int a, int b) // parameter of values 
    {

	return a + b; // return statement a + b

    }

    public int computeSub(int c, int d) {
	int valE = c - d; // local variable inside method
	return valE; // return statement valE

    }

    public static void main(String[] args) {

	Sum obj = new Sum(); // Object creation
	/*
	 * pass by value,calling methods 
	 * obj.computeSum()
	 * obj.computeSub()
	 */
	System.out.println(obj.computeSum(5, 5)); // 5 + 5 => 10
	System.out.println(obj.computeSub(2, 10)); // 2 - 10 => - 8
    }

} // End of the block 
