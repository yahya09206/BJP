/*
Modify your code from the previous problem to produce the following output:

999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
*/
public class NestedNumbersThree {
	public static void main(String[] args){
		for(int i = 0; i < 5; i++){
			for(int j = 9; j >= 0; j--){
				for(int k = 0; k < 5; k++){
					// System.out.print(k%10);
					System.out.print(j);
				}
				// System.out.print(j);
			}
			System.out.println();
		}
	}
}