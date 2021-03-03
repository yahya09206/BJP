/*
Write a method named lastDigit that returns the last digit of an integer. For example, lastDigit(3572) should return 2. It should work for negative numbers as well. For example, lastDigit(-947) should return 7.

Call	Value Returned
lastDigit(3572)	2
lastDigit(-947)	7
lastDigit(6)	6
lastDigit(35)	5
lastDigit(123456)	6
(Hint: This is a short method. You may not use a String to solve this problem.)
*/
public class LastDigit {
	public static void main(String[] args){
		System.out.println(lastDigit(3572));
		System.out.println(lastDigit(-947));
	}
	public static int lastDigit(int n){
		return Math.abs(n % 10);
	}
}
