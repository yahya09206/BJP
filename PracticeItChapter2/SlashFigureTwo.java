public class SlashFigure {
	public static final int SIZE = 10;
	public static void main(String[] args){

		for(int line = 1; line <= SIZE; line++){
			for(int i = 0; i < 2 * line - 2; i++){
				System.out.print("\\");
			}
			for(int j = 0; j < -4 * line + 4 * SIZE + 2; j++){
                System.out.print("!");
			}
			for(int k = 0; k < 2 * line - 2; k++){
				System.out.print("/");
			}
			System.out.println();
		}
	}
}