/*
Modify your code from the previous problem to produce the following output:

99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
*/
public class NestedNumbersTwo {
	public static void main(String[] args){
		//For loop for numbers
		for (int i = 0; i < 5; i++) {
			for (int j = 10 - 1; j >= 0; j--) {
				for (int k = 0; k < 6 - 1; k++) {
					System.out.print(j);			
				}		
			}
			System.out.println();	
		}
	}
}