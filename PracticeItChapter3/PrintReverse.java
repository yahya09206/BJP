/*
Write a method called printReverse that accepts a String as its parameter and prints the characters in opposite order. For example, a call of printReverse("hello there!"); should print the following output:

!ereht olleh
If the empty string is passed, no output is produced. Your method should produce a complete line of output.
*/
public class PrintReverse {
	public static void main(String[] args){
		printReverse("hello there!");
	}
	public static void printReverse(String s){
		for(int i = s.length() - 1; i >= 0; i--){
			System.out.print(s.charAt(i));
		}
	}
}