/*
Write a method called min that takes three integers as parameters and returns the smallest of the three values, such that a call of min(3, -2, 7) would return -2, and a call of min(19, 27, 6) would return 6. Use Math.min to write your solution.
*/
public class Min {
	public static void main(String[] args){
		min(1,3,4);
	}

	public static int min(int a, int b, int c){
		int min = Math.min((Math.min(a,b)),c);
		return min;
	}
}