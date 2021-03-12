/*
Write a method named printFactors that accepts an integer as its parameter and uses a fencepost loop to print the factors of that number, separated by the word " and ". For example, the number 24's factors should print as:

1 and 2 and 3 and 4 and 6 and 8 and 12 and 24
You may assume that the number parameter's value is greater than 0.
*/
public class Printfactors {
	public static void main(String[] args){
		printFactors(24);
	}
	public static void printFactors(int n){
		System.out.print(1);
		for(int i = 2; i <= n; i++){
			if(n % i == 0){
				System.out.print(" and " + i);
			}
		}
	}
}