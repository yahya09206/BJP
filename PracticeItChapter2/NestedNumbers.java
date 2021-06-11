/*
Write nested for loops that produce the following output:
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
*/
public class NestedNumbers {
	public static void main(String[] args){
		for(int i = 1; i <= 3; i++){
			for(int j = 0; j < 10; j++){
				for(int k = j; k <= j; k++){
					System.out.print(k%10);
					System.out.print(j);
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
}