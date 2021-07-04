/*
Write code to produce a cumulative product by multiplying together many numbers that are read from the console. Match the following format:

How many numbers? 4
Next number --> 7
Next number --> 2
Next number --> 3
Next number --> 15
Product = 630
*/
import java.util.Scanner;
public class CumulativeProduct {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int num = scan.nextInt();
		int product = 0;
		for(int i = 0; i <= num.length; i++){
			System.out.print("Next number ---> ");
			int nums = scan.next();
			product *= nums;
		}
		System.out.println("Product = " + product);
	}
}