/*
Write nested for loops to produce the following output:

    1
   22
  333
 4444
55555
*/
public class SpacesAndNumbers {
	public static void main(String[] args){
		for(int i = 1; i <= 5; i++) {
    		for(int j = 5 - i; j > 0; j--) {
    			for(int k = 0; k < i; k++){
    				System.out.print(j);
    			}
    			System.out.print(" ");
    		}
		}
			System.out.println();
	}
}