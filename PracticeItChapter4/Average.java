/*
Write a method called average that takes two integers as parameters and returns the average of the two integers.
*/
public class Average {
	public static void main(String[] args){
		System.out.println(average());
	}
	public static double average(int a, int b){
		double avg = a + b;
		return avg / 2;
	}
}