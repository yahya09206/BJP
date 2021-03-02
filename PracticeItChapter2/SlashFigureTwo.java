/*
Modify the SlashFigure program from the previous exercise to produce a new program SlashFigure2 that uses a global constant for the figure's height. The previous output used a constant height of 6. Here is the outputs for a constant height of 4 and 7 respectively: (If you previously solved Self-Check problems 34 and 35 in the book, you will have created a loop table that will be useful in solving this problem. Use it!)

size 4	size 7
!!!!!!!!!!!!!!
\\!!!!!!!!!!//
\\\\!!!!!!////
\\\\\\!!//////
!!!!!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!!!!!//////
\\\\\\\\!!!!!!!!!!////////
\\\\\\\\\\!!!!!!//////////
\\\\\\\\\\\\!!////////////

*/
public class SlashFigure {
	public static void main(String[] args){
		slashFigure();
	}
	public static void slashFigure(){
		//Loop for slashes
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < 2 * i - 2; j++) {
				System.out.print("\\");
			}//Loop for !
			for (int k = 0; k < -4 * i + 26; k++) {
				System.out.print("!");
			}
			for (int j = 0; j < 2 * i - 2; j++) {
				System.out.print("/");
			}
			System.out.println();
		}
	}
}