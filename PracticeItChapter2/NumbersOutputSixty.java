public class NumbersOutputSixty {
	public static void main(String[] args){
		//For loop for bar
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(" ");
			}
			System.out.print("|");
		}
		System.out.println();
		//For loop for numbers
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j%10);		
			}	
		}
	}
}