/*
Write a method called zeroDigits that accepts an integer parameter and returns the number of digits in the number that have the value 0. For example, the call zeroDigits(5024036) should return 2, and zeroDigits(743) should return 0. The call zeroDigits(0) should return 1. You may assume that the integer is non-negative. (We suggest you use a do/while loop in your solution.)
*/
public class ZeroDigits {
	public static void main(String[] args){
		System.out.println(zeroDigits(5024036));
		System.out.println(zeroDigits(743));
		System.out.println(zeroDigits(0));
	}
	public static int zeroDigits(int n){
		int count = 0;
		do {
			if(n % 10 == 0){
				count++;
			}
			n = n / 10;
		}while(n > 0);
		return count;
	}
}