/*
Write a method called printReverse that accepts a String as its parameter and prints the characters in opposite order. For example, a call of printReverse("hello there!"); should print the following output:

!ereht olleh
If the empty string is passed, no output is produced. Your method should produce a complete line of output.
*/
public class PrintReverse {
	public static void main(String[] args){
		printReverse("hello there!");
	}

	public static void printReverse(String phrase){
		if(phrase.length() == 0){
			System.out.print(" ");
		}
		for(int i = phrase.length() - 1; i >= 0; i--){
			System.out.print(phrase.charAt(i));
		}
	}
}