/*
Write a method called scientific that accepts two real numbers as parameters for a base and an exponent and computes the base times 10 to the exponent, as seen in scientific notation. For example, the call of scientific(6.23, 5.0) would return 623000.0 and the call of scientific(1.9, -2.0) would return 0.019.
*/
public class Scientific {
	public static void main(String[] args){

		scientific(6.23, 5.0);
		scientific(1.9, -2.0);
	}

	public double scientific(double base, double exp){
		return base * Math.pow(10, exp);
	}
}