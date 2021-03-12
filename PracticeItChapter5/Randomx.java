/*
(This problem is a modified version of Chapter 5's randomX exercise from the textbook.)

Write a method named randomX that keeps printing lines, where each line contains a random number of x characters between 5 and 19 inclusive, until it prints a line with 16 or more characters. For example, the output from your method might be the following. Notice that the last line has 17 x characters.

xxxxxxx
xxxxxxxxxxxxx
xxxxxx  
xxxxxxxxxxx
xxxxxxxxxxxxxxxxx
*/
import java.util.*;
public class Randomx {
	public static void main(String[] args){
		randomX();
	}
	public static void randomX(){
		Random rand = new Random();
		int n = 0;
		while(n < 16){
			n = 5 + rand.nextInt(15);
			for(int i = 0; i < n; i++){
				System.out.print("x");
			}
			System.out.println();
		}
	}
}