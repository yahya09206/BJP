/*
Write a method named printGPA that calculates a student's grade point average. The user will type a line of input containing the student's name, then a number of scores, followed by that many integer scores. Here are two example dialogues:

Enter a student record: Maria 5 72 91 84 89 78
Maria's grade is 82.8
Enter a student record: Jordan 4 86 71 62 90
Jordan's grade is 77.25
For example, Maria's grade is 82.8 because her average of (72 + 91 + 84 + 89 + 78) / 5 equals 82.8. Use a Scanner for user input.
*/
import java.util.Scanner;
public class PrintGPA {
	public static void main(String[] args){
		printGPA();
	}
	
	public static void printGPA(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a student record: ");
		String name = scan.next();
		int scores = scan.nextInt();
		int total = 0;
		for(int i = 0; i <= scores; i++){
			int grades = scan.nextInt();
			total += grades;
		}
		double average = (double)total / scores;
		System.out.println(name + "'s grade is " + average);
	}
}