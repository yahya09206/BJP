/*
Write a method called average that takes two integers as parameters and returns the average of the two integers.
*/
public class Average {
	public static void main(String[] args){
		System.out.println(average(2, 2));
	}
	
	public static int average(int a, int b){
		int sum = a + b;
		return (double) sum / 2;
	}
}