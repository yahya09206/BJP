public class WaveNumbersForty {
	public static void main(String[] args){
		//For loop for dashes
		for (int i = 1; i <= 40; i++) {
			System.out.print("-");
		}
		System.out.println();
		//For loop for triangle
		for (int i = 0; i < 10; i++) {
			System.out.print("_-^-");
		}
		System.out.println();
		//For loop for numbers
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j%10);
				System.out.print(j%10);				
			}	
		}
		System.out.println();
		//For loop for dashes
		for (int i = 1; i <= 40; i++) {
			System.out.print("-");
		}
	}
}