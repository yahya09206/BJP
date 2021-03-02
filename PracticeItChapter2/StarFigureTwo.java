/*
Modify your StarFigure code from the previous problem to use a constant for the size. The outputs below use a constant size of 3 (left) and 6 (right):

size 3	size 6
////////\\\\\\\\
////********\\\\
****************
////////////////////\\\\\\\\\\\\\\\\\\\\
////////////////********\\\\\\\\\\\\\\\\
////////////****************\\\\\\\\\\\\
////////************************\\\\\\\\
////********************************\\\\
****************************************
(You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used in the way described in this problem.)
*/
public class StarFigureTwo {
	public static final int SIZE = 10;

	public static void main(String[] args){
		//Loop for //
		for (int i = 1; i <= SIZE; i++) {
			for (int j = 0; j < (-4 * i + 4 * SIZE); j++) {
				System.out.print("/");
			}for (int k = 0; k < 8 * i - 8; k++) {
				System.out.print("*");
			}for (int j = 0; j < (-4 * i + 4 * SIZE); j++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
}