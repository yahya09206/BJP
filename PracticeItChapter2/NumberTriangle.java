public class NumberTriangle {
	public static void main(String[] args){
		for(int i = 0; i <= 7; i++){
			for (int j = 0; j < i;j++ ) {
				for (int k = j;k <= j; k++) {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}