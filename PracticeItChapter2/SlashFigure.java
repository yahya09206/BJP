/*
Write a Java program in a class named SlashFigure that produces the following output. Use nested for loops to capture the structure of the figure. (If you previously solved Self-Check problems 34 and 35 in the book, you will have created a loop table that will be useful in solving this problem. Use it!)

!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////
*/
public class SlashFigure {
	public static void main(String[] args){

		for(int line = 1; line <= 6; line++){
			for(int i = 0; i < 2 * line - 2; i++){
				System.out.print("\\");
			}
			for(int j = 0; j < -4 * line + 26; j++){
                System.out.print("!");
			}
			for(int k = 0; k < 2 * line - 2; k++){
				System.out.print("/");
			}
			System.out.println();
		}
	}
}