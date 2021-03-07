/*
Write code to produce a cumulative product by multiplying together many numbers that are read from the console. Match the following format:

How many numbers? 4
Next number --> 7
Next number --> 2
Next number --> 3
Next number --> 15
Product = 630
*/
import java.util.*;
public class CumulativeProduct {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int num = console.nextInt();
		int sum = 1;
		for(int i = 1; i <= num; i++){
			System.out.print("Next number --> ");
			int nums = console.nextInt();
			sum *= nums;
		}
		System.out.print("Product = " + sum);
	}
}