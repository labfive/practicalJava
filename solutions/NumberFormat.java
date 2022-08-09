

// import statement to add java libraries 
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class NumberFormat {
    // Decimal formatter using 0.00 
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
	
	        double prod1 = 123.40,prod2 = 550.78; 

	        double cost = prod1 + prod2;

	        System.out.format("1) Number formater trailing one zero: %.3f", cost);
	        System.out.println(); // next line => println //
	        System.out.format("2) Number formater trailing zero: %3f", cost);
	        System.out.println(); // next line => println //
	       
	        df.setRoundingMode(RoundingMode.DOWN); // set your rounding mode 
	        System.out.println("3) Round down the cost: " + df.format(cost));
	    }
    }

