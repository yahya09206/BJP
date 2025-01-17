/*
Write a method named negativeSum that accepts a Scanner as a parameter reading input from a file containing a series of integers, and determine whether the sum starting from the first number is ever negative. The method should print a message indicating whether a negative sum is possible and should return true if a negative sum can be reached and false if not. For example, if the file contains the following text, your method will consider the sum of just one number (38), the sum of the first two numbers (38 + 4), the sum of the first three numbers (38 + 4 + 19), and so on up to the sum of all of the numbers:

38 4 19 -27 -15 -3 4 19 38
None of these sums is negative, so the method would produce the following message and return false:

no negative sum
If the file instead contains the following numbers, the method finds that a negative sum of -8 is reached after adding 6 numbers together (14 + 7 + -10 + 9 + -18 + -10):

14 7 -10 9 -18 -10 17 42 98
It should output the following and return true, indicating that a negative sum can be reached:

-8 after 6 steps
*/
import java.util.*;
public class NegativeSum {
	public static void main(String[] args){
		negativeSum();
	}
	public static void negativeSum(Scanner sc) throws FileNotFoundException{
		int count = 0;
		int sum = 0;
		while(sc.hasNext()) {
	        sum += sc.nextInt();
	        count++;
	        
	        if(sum < 0){
	        	System.out.println(sum + " after " + count + " steps");
	        	return true;
	        }
	   	}
	   	System.out.println("no negative sum");
	   	return false;
	}
}