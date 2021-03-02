/*
Write a program in a class named StarFigure that produces the following output using for loops.

////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
********************************
*/
public class StarFigure {
	public static void main(String[] args){
		//Loop for //
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < -4 * i + 20; j++) {
				System.out.print("/");
			}for (int k = 0; k < 8 * i - 8; k++) {
				System.out.print("*");
			}for (int j = 0; j < -4 * i + 20; j++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
}