/*
Write a complete Java program in a class named Mantra that produces the following output. Remove its redundancy by adding a method.

There's one thing every coder must understand:
The System.out.println command.

There's one thing every coder must understand:
The System.out.println command.
*/
public class Mantra {
	public static void main(String[] args){
		mantra();
		System.out.println();
		mantra();
	}

	public static void mantra(){
		System.out.println("There's one thing every coder must understand:");
		System.out.println("The System.out.println command.");
	}
}