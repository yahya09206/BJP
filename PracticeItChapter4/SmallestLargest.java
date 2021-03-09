/*
Write a method named smallestLargest that asks the user to enter numbers, then prints the smallest and largest of all the numbers typed in by the user. You may assume the user enters a valid number greater than 0 for the number of numbers to read. Here is an example dialogue:

How many numbers do you want to enter? 4
Number 1: 5
Number 2: 11
Number 3: -2
Number 4: 3
Smallest = -2
Largest = 11
*/
import java.util.*;
public class SmallestLargest {
	public static void main(String[] args){
		smallestLargest();
	}
	public static void smallestLargest(){
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers do you want to enter? ");
		int n = console.nextInt();
		int max = n;
		int min = n;
		for(int i = 1; i <= n; i++){
			System.out.print("Number " + i + ": ");
			int num = console.nextInt();
			if(max < num){
				max = num;
			}
			if(min > num) {
				min = num;
			}
		}
		System.out.println("Smallest = " + min);
		System.out.println("Largest = " + max);
	}

}