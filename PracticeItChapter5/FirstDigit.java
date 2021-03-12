/*
Write a method named firstDigit that returns the first digit of an integer. For example, firstDigit(3572) should return 3. It should work for negative numbers as well. For example, firstDigit(-947) should return 9.

Call	Value Returned
firstDigit(3572)	3
firstDigit(-947)	9
firstDigit(6)	6
firstDigit(35)	3
firstDigit(123456)	1
(Hint: Use a while loop. You may not use a String to solve this problem.)
*/
import java.util.*;
public class FirstDigit {
	public static void main(String[] args){
		System.out.println(firstDigit(3572));
		System.out.println(firstDigit(-947));
	}
	public static int firstDigit(int n){
		n = Math.abs(n);
		while(n > 9){
			n /= 10;
		}
		return n;
	}
}