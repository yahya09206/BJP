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
	public static final int SIZE = 3;
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