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

		for(int line = 1; line <= 5; line++){
			for(int i = 0; i < -4 * line + 20; i++){
				System.out.print("/");
			}
			for(int j = 0; j < 8 * line - 8; j++){
				System.out.print("*");
			}
			for(int i = 0; i < -4 * line + 20; i++){
				System.out.print("\\");
			}
			System.out.println();
		}
	}
}