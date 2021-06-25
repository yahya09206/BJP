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

SIZE 	/ and \			*
6 		20,16,12,8,4 	0,8,16,24,32,40
3 		8,4,0 			0,8,16

size 6 = -4 * line + 24
size 3 = -4 * line + 12
expression (multiply by 4)
-4 * line + (4 * SIZe);

*/
public class StarFigureTwo {
	public static final int SIZE = 3;
	public static void main(String[] args){

		for(int line = 1; line <= 5; line++){
			for(int i = 0; i < -4 * line + 4 * SIZE; i++){
				System.out.print("/");
			}
			for(int j = 0; j < 8 * line - 8; j++){
				System.out.print("*");
			}
			for(int i = 0; i < -4 * line + 4 * SIZE; i++){
				System.out.print("\\");
			}
			System.out.println();
		}
	}
}