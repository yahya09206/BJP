/*
Write a method named pow that accepts a base and an exponent as parameters and returns the base raised to the given power. For example, the call pow(3, 4) returns 3 * 3 * 3 * 3 or 81. Do not use Math.pow in your solution. Assume that the base and exponent are non-negative.
*/
public class Pow {
	public static void main(String[] args){
		pow(3, 4);
	}
	public static int pow(int a, int b){
		int result = 1;
		for(int i = b; b != 0; --b){
			result *= a;
		}
		return result;
	}
}