/*
Write a sentinel loop that repeatedly prompts the user to enter a number and, once the number -1 is typed, displays the maximum and minimum numbers that the user entered. Here is a sample dialogue:

Type a number (or -1 to stop): 5
Type a number (or -1 to stop): 2
Type a number (or -1 to stop): 17
Type a number (or -1 to stop): 8
Type a number (or -1 to stop): -1
Maximum was 17
Minimum was 2
*/
import java.util.*;
public class SentinelMinMax {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Type a number (or -1 to stop): ");
		int n = console.nextInt();
		int max = n;
		int min = n;
		while(n != -1){
			if(n < min){
				min = n;
			}else if(n > max){
				max = n;
			}
			System.out.print("Type a number (or -1 to stop): ");
			n = console.nextInt();
		}
		if(min != -1){
			System.out.println("Maximum was " + max);
			System.out.println("Minimum was " + min);
		}
	}
}